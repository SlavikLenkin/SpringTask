package com.mycompany.controller;

import com.mycompany.model.user.User;
import com.mycompany.service.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SendEmailController {

    @GetMapping("/sendEmail")
    public String userForm(Model model) {
        model.addAttribute("user",new User());
        return "sendEmail";
    }

    @Autowired
    SendEmail emailService;
    @PostMapping("sendEmail")
    public String handleFileUpload(User user){
        emailService.sendPreConfiguredMail(user.getEmail(), user.getMessage());
        return "resultSendEmail";
    }


}

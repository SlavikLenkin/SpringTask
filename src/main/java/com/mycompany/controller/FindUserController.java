package com.mycompany.controller;

import com.mycompany.model.user.User;
import com.mycompany.service.AddUser;
import com.mycompany.service.FindUser;
import com.mycompany.service.ReadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FindUserController {

    @GetMapping("/findUser")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "findUser";
    }

    @Autowired
    FindUser findUser;
    @PostMapping("findUser")
    public String userSubmit(User user ,HttpServletRequest req) {
        return findUser.findUser(user ,req);
    }
}

package com.mycompany.controller;

import com.mycompany.model.user.User;
import com.mycompany.service.AddUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddUserController {

    @GetMapping("/user")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }


    @Autowired
    private AddUser addUser;
    @PostMapping("user")
    public String userSubmit(User user) {
        addUser.add(user.getUser(), "#", "users.txt");
        return "user";
    }

}

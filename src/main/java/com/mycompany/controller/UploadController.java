package com.mycompany.controller;

import com.mycompany.model.user.User;
import com.mycompany.service.Upload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UploadController {

    @Autowired
    Upload upload;
    @PostMapping("/upload")
    public String handleFileUpload(User user, @RequestParam("file") MultipartFile file) {
        upload.newUser(user, file);
        return "user";
    }
}

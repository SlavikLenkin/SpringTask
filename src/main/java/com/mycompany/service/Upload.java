package com.mycompany.service;

import com.mycompany.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



@Service("upload")
public class Upload {
    @Autowired
    private ReadFile readFile;

    public void newUser(User user, MultipartFile file) {
        String[] data;
        data = readFile.readTxtFile("#", file);
        user.setFullUser(data);
    }
}

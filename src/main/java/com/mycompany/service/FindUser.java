package com.mycompany.service;

import com.mycompany.model.user.User;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("findUser")
public class FindUser {
    @Autowired
    private ReadFile readFile;

    public String findUser(User user, HttpServletRequest req) {
        List<String[]> data = new ArrayList<>();
        data = readFile.readTxtFile("#", "users.txt");
        for (String[] str : data) {
            if (user.getFirstName().equalsIgnoreCase(str[0]) && user.getLastName().equalsIgnoreCase(str[1])) {
                user.setUser(str);

                UserAgent userAgent = UserAgent.parseUserAgentString(req.getHeader("User-Agent"));
                user.setBrowserName(userAgent.getBrowser().getName());
                Date date = new Date();
                user.setDate(date);
                return "resultSearch";
            }
        }
        return "notFound";
    }


}

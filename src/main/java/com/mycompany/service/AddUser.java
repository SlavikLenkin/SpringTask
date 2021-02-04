package com.mycompany.service;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service("AddUser")
public class AddUser {
    public static void add(List<String> data, String separator, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (String str : data) {
                writer.append(str);
                writer.append(separator);
            }
            writer.append("\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

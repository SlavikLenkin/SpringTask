package com.mycompany.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("readFile")
public class ReadFile {
    public List<String[]> readTxtFile(String separator, String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            List<String[]> list = new ArrayList<>();
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] array = line.split(separator);
                list.add(array);
            }
            return list;
        } catch (IOException e) {
            System.out.println("fine not found");
            e.printStackTrace();
            return null;
        }

    }


    public String[] readTxtFile(String separator, MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String[] fields = null;
            String s = new String(bytes);
            fields = s.split(separator);
            return fields;
        } catch (IOException e) {
            System.out.println("fine not found");
            e.printStackTrace();
            return null;
        }

    }
}

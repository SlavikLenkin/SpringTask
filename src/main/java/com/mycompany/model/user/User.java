package com.mycompany.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private String middleName;
    private String age;
    private String salary;
    private String email;
    private String workAddres;
    private String browserName;
    private Date date;
    private String message;
    private String result;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkAddres() {
        return workAddres;
    }

    public void setWorkAddres(String workAddres) {
        this.workAddres = workAddres;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<String> getUser() {
        List<String> list = new ArrayList<>();
        list.add(firstName);
        list.add(lastName);
        list.add(middleName);
        list.add(age);
        list.add(salary);
        list.add(email);
        list.add(workAddres);
        return list;
    }

    public void setUser(String[] str) {
        setMiddleName(str[2]);
        setAge(str[3]);
        setSalary(str[4]);
        setEmail(str[5]);
        setWorkAddres(str[6]);
    }

    public void setFullUser(String[] str) {
        setLastName(str[0]);
        setFirstName(str[1]);
        setUser(str);

    }
}

package org.firstmvc.springmvcfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


@Controller //this helps to intercept http requests
public class IndexController {
    static int a = 1;

    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String returnIndex() {
        return "index"; //returning the page name
    }


    @RequestMapping(value = {"/save"}, method = RequestMethod.POST)
    public String loged(@RequestParam("user_name") String user_name, @RequestParam("password") String password) {
        if (user_name.equals("user") & password.equals("1234")) {
            return "loged_user";
        } else if (user_name.equals("expert") & password.equals("1234")) {
            return "loged_expert";
        } else {
            return "index";
        }
    }

    @RequestMapping(value = {"/login-form"}, method = RequestMethod.POST)
    public String loged_user(@RequestParam("query") String query) throws IOException {
        System.out.println(query);
        BufferedWriter writer = new BufferedWriter(new FileWriter( "C:/Users/Pravat Kiran Timsina/Desktop/SpringMvcFirst/src/main/files/"+a+".txt"));
        writer.write(query);
        writer.close();
        a++;
        return  "index";
    }

    @RequestMapping(value = {"/loged-expert"}, method = RequestMethod.POST)
    public String log_exp() throws IOException {
        String file = "C:/Users/Pravat Kiran Timsina/Desktop/SpringMvcFirst/src/main/files/1.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentline = reader.readLine();
        System.out.println(currentline);
        reader.close();
        return "loged_expert";
    }
}




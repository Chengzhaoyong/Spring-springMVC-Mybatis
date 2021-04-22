package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class controller {

      @RequestMapping("/gologin")
    public String gologin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String pwd, HttpSession session){
        session.setAttribute("user",username);
        return "main";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

}

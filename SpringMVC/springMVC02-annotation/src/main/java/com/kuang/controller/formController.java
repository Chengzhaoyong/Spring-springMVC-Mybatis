package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class formController {
    @PostMapping("/t1/m1")
    public String test(String name, Model model){
        model.addAttribute("msg",name);
        return "hello";
    }
}

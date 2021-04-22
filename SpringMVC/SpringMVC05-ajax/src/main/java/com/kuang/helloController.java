package com.kuang;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping("/hello")
    public String test(Model model){
        model.addAttribute("msg","helloworld");
        return "hello";
    }
}

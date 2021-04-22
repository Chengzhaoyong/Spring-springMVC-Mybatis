package com.kuang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/t1")
    public String test() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        User user=new User("程兆永",12);
        String value = mapper.writeValueAsString(user);
        return value;
    }


}

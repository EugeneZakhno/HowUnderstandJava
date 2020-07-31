package io.github.eugenezakhno.javablog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// https://www.youtube.com/watch?v=OUreWcL6zcc
@Controller
public class PostController {

    @GetMapping("/")
    public String hello (){
        return "hello";
    }




}

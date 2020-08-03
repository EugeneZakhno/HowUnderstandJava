package io.github.eugenezakhno.javablog.controller;

import io.github.eugenezakhno.javablog.service.impl.MemPostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// https://www.youtube.com/watch?v=OUreWcL6zcc
@Controller
public class PostController {

    private final  MemPostService memPostService;

    public PostController(MemPostService memPostService) {
        this.memPostService = memPostService;
    }

    @GetMapping("/")
    public String hello (){


        return "hello";
    }
}

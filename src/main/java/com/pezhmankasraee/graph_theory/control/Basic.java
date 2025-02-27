package com.pezhmankasraee.graph_theory.control;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("api/base")
public class Basic {

    @GetMapping("v0/helloworld")
    public String getHelloWorld() {
        return "hello, world!";
    }
}

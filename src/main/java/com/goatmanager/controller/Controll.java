package com.goatmanager.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class Controll {
    @GetMapping("/demo")
    public String index() {
        return "demo";
    }
    @GetMapping("/info-goats")
    public String index2() {
        return "goats";
    }
}

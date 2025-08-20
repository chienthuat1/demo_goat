package com.goatmanager.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@Controller
public class Controll {
    @GetMapping("/demo")
    public String index() {
        return "demo";
    }
    @GetMapping("/info-goats")
    public String index2() {
        return "goats";
    }
    @GetMapping("/")
    public String index3() {
        return "test";
    }
    @GetMapping("/test")
    public String index4() {
        return "animal/animal";
    }
    @GetMapping("/test1")
    public String index5() {
        return "animal/info_animal";
    }
}

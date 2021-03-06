package com.shomobay.dokan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @GetMapping({"/welcome", "/"})
    public String welcome() {
        return "welcome";
    }

    @GetMapping({"/home"})
    public String home() {
        return "home";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
}

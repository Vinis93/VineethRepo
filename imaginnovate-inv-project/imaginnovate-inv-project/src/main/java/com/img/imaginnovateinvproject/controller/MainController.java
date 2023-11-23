package com.img.imaginnovateinvproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Employee")
public class MainController {
    @GetMapping(value = "/testApi", produces = "application/json")
    public String getBook(@PathVariable int id) {
        return "Api is working as expected";
    }
}

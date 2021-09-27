package com.techreturners.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookManagerController {

    @GetMapping(value = "/api/book")
    public String book(){
        return "view all books endpoint";
    }
}

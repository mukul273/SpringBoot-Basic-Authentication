package com.springframework.security.springsecuritybasic.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @GetMapping
    @PreAuthorize("hasRole('USER')") // To avoid other User roles from accessing the endpoint (Method level Security - Optional)
    //@PreAuthorize("hasRole('ADMIN')") // Will not work because ROLE defined is USER (properties)
    public String checkAccessForApplication(){
        return "You are Authorized, Welcome to Spring Basic Security Demonstration !!!";
    }
}

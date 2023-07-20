package com.icarlosalbertojr.demosecurity.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PreAuthorize("hasAnyAuthority('ADMIN','USER')")
    @GetMapping
    public void get() {
        System.out.println("GET!");
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public void post() {
        System.out.println("POST!");
    }

}

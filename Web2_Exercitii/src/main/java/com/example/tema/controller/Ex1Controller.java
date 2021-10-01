package com.example.tema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1Controller {

    @GetMapping("p1")
    public String method1(HttpServletRequest httpServletRequest) {
        // punctul a
        return "Ex 1/a URL-ul aplicației relativ la adresa serverului: " + httpServletRequest.getServletPath();
    }

    @GetMapping("p2")
    public String method2(HttpServletRequest httpServletRequest) {
        // punctul b
        return "Ex 1/b URL-ul metodei mapate relativ la adresa aplicației: " + httpServletRequest.getRequestURI();
    }

    @GetMapping("p3")
    public String method3(HttpServletRequest httpServletRequest) {
        // punctul c
        return "Ex 1/c URL-ul absolut al cererii HTTP: " + httpServletRequest.getRequestURL();
    }

    @GetMapping("p4")
    public String method4(HttpServletRequest httpServletRequest) {
        // punctul d
        return "Ex 1/d Partea adresei din cerere fără protocol și șirul de perechi nume=valoare: " + httpServletRequest.getContextPath();
    }

    @GetMapping("p5")
    public String method5(HttpServletRequest httpServletRequest) {
        // punctul e
        return "Ex 1/e Sirul de perechi nume=valoare a cererii HTTP.: " + httpServletRequest.getQueryString();
    }
}

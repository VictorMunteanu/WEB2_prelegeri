package com.example.tema.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Ex2Cookies {
    private static final String MY_COOKIE = "cookieForIS31Z";

    @GetMapping("/cookies/add")
    public String addCookie(HttpServletResponse response) {
        Cookie uiColorCookie = new
                Cookie(MY_COOKIE, "keep_calm_and_do_programming");
        response.addCookie(uiColorCookie);
        return "Cookie added, please check!";
    }

    @GetMapping("/cookies/my-cookie")
    public String addCookie(HttpServletRequest request, @CookieValue(name
            = MY_COOKIE, required = false) String cookieValue) {
        return "My cookie value is:" + Objects.toString(cookieValue);
    }

    @GetMapping("/cookies/p2")
    public String method2(HttpServletRequest httpServletRequest) {
        return "Ex 2/b Lista de antete cerere: " + httpServletRequest.getHeader("headers");
    }

    @GetMapping("/cookies/p3")
    public String method3(HttpServletRequest httpServletRequest) {
        return "Ex 2/c Lista de parametri din query string: " + httpServletRequest.getHeaderNames().toString();
    }
}

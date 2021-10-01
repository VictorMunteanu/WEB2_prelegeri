package com.example.tema.controller;

import com.example.tema.operations.Add;
import com.example.tema.operations.Concat;
import com.example.tema.operations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/ex3")
public class Ex3Controller {
    @PostMapping("/add")
    public Integer add(@RequestBody Add numbers) {
        return numbers.a + numbers.b;
    }

    @PostMapping("/concat")
    public String concat(@RequestBody Concat concat) {
        return concat.a + concat.b;
    }

    @PostMapping("/operation")
    public Double op(@RequestBody Operation numbers) {
        double result = 0;
        switch (numbers.operation) {
            case "+":
                result = numbers.a + numbers.b;
                break;
            case "-":
                result = numbers.a - numbers.b;
                break;
            case "*":
                result = numbers.a * numbers.b;
                break;
            case "/":
                result = (double) numbers.a / (double) numbers.b;
                break;
            default:
                System.out.println("unknown operator, you can choose = - * /");
                break;
        }
        return result;
    }

    @GetMapping
    public String[] concatGet(HttpServletRequest request) {
        return request.getRequestURI().split("/");
    }
}

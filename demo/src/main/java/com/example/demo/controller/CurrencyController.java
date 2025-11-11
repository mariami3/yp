package com.example.demo.controller;

import com.example.demo.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/currency")
    public String currencyPage() {
        return "currency";
    }

    @PostMapping("/convert")
    public String convert(
            @RequestParam double amount,
            @RequestParam String from,
            @RequestParam String to,
            Model model) {

        double result = currencyService.convert(amount, from, to);
        model.addAttribute("result", result);
        return "result";
    }
}
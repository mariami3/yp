package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    public double convert(double amount, String from, String to) {
        double rateUSD = 1.0;
        double rateEUR = 0.92;
        double rateRUB = 93.0;

        double fromRate = switch (from) {
            case "USD" -> rateUSD;
            case "EUR" -> rateEUR;
            default -> rateRUB;
        };

        double toRate = switch (to) {
            case "USD" -> rateUSD;
            case "EUR" -> rateEUR;
            default -> rateRUB;
        };

        return amount * (toRate / fromRate);
    }
}

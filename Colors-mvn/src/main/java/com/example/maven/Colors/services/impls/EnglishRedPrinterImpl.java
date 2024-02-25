package com.example.maven.Colors.services.impls;

import org.springframework.stereotype.Component;

import com.example.maven.Colors.services.RedPrinter;
@Component
public class EnglishRedPrinterImpl implements RedPrinter {

    @Override
    public String Color() {
        return "Red";
    }
    
}

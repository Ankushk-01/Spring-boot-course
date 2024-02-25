package com.example.maven.Colors.services.impls;

import org.springframework.stereotype.Component;

import com.example.maven.Colors.services.GreenPrinter;

@Component
public class EnglishGreenPrinterImpl implements GreenPrinter {

    @Override
    public String Color() {
        return "Green";
    }
    
}

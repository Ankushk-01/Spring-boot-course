package com.example.maven.Colors.services.impls;

import org.springframework.stereotype.Component;

import com.example.maven.Colors.services.BluePrinter;
@Component
public class EnglishBluePrinterImpl implements BluePrinter{

    @Override
    public String Color() {
        return "Blue";
    }
    
}

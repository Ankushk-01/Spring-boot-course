package com.example.maven.Colors.services.impls;

import com.example.maven.Colors.services.ColorPrinter;
import com.example.maven.Colors.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter = new EnglishRedPrinterImpl();
    @Override
    public String Print() {
        return "Hello";
    }
    
}

package com.example.maven.Colors.services.impls;

import org.springframework.stereotype.Component;

import com.example.maven.Colors.services.BluePrinter;
import com.example.maven.Colors.services.ColorPrinter;
import com.example.maven.Colors.services.GreenPrinter;
import com.example.maven.Colors.services.RedPrinter;
@Component
public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String Print() {
        return "Red Printer color : "+redPrinter.Color()+", Blue Printer color : "+bluePrinter.Color()+", Green Printer color : "+greenPrinter.Color();
    }

}

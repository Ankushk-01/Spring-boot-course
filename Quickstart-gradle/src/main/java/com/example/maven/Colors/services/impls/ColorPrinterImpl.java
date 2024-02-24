package com.example.maven.Colors.services.impls;

import com.example.maven.Colors.services.BluePrinter;
import com.example.maven.Colors.services.ColorPrinter;
import com.example.maven.Colors.services.GreenPrinter;
import com.example.maven.Colors.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl() {
        this.redPrinter = new EnglishRedPrinterImpl();
        this.greenPrinter = new EnglishGreenPrinterImpl();
        this.bluePrinter = new EnglishBluePrinterImpl();
    }

    @Override
    public String Print() {
        return "Red Printer color : "+redPrinter.Color()+" Blue Printer color : "+bluePrinter.Color()+"/n Green Printer color : "+greenPrinter.Color();
    }

}

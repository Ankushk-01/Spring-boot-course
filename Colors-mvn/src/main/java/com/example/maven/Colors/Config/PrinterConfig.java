package com.example.maven.Colors.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.maven.Colors.services.BluePrinter;
import com.example.maven.Colors.services.ColorPrinter;
import com.example.maven.Colors.services.GreenPrinter;
import com.example.maven.Colors.services.RedPrinter;
import com.example.maven.Colors.services.impls.ColorPrinterImpl;
import com.example.maven.Colors.services.impls.EnglishBluePrinterImpl;
import com.example.maven.Colors.services.impls.EnglishGreenPrinterImpl;
import com.example.maven.Colors.services.impls.EnglishRedPrinterImpl;

@Configuration
public class PrinterConfig {
	@Bean
	public RedPrinter redPrinter() {
		return new EnglishRedPrinterImpl();
	}
	
	@Bean
	public BluePrinter bluePrinter() {
		return new EnglishBluePrinterImpl();
	}
	
	@Bean
	public GreenPrinter greenPrinter() {
		return new EnglishGreenPrinterImpl();
	}
	
	@Bean
	public ColorPrinter colorPrinter(RedPrinter redPrinter,BluePrinter bluePrinter,GreenPrinter greenPrinter) {
		return new ColorPrinterImpl(redPrinter,greenPrinter,bluePrinter);
	}
}

package com.example.maven.Colors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.maven.Colors.services.ColorPrinter;

import java.util.logging.Logger;


@SpringBootApplication
public class ColorsApplication implements CommandLineRunner{
	Logger logger = Logger.getLogger(ColorsApplication.class.getName());
	private ColorPrinter printer;
	
	ColorsApplication(ColorPrinter colorPrinter){
		this.printer = colorPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(ColorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Printers Info : "+printer.Print());
	}
}

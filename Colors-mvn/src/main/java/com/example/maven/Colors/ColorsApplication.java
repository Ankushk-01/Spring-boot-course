package com.example.maven.Colors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.maven.Colors.services.ColorPrinter;
import com.example.maven.Colors.services.Student;

import java.util.logging.Logger;


@SpringBootApplication
public class ColorsApplication implements CommandLineRunner{
	Logger logger = Logger.getLogger(ColorsApplication.class.getName());
	private ColorPrinter printer;
	private Student student;
	ColorsApplication(ColorPrinter colorPrinter,Student student){
		this.printer = colorPrinter;
		this.student = student;
	}
	public static void main(String[] args) {
		SpringApplication.run(ColorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Printers Info : "+printer.Print());
		logger.info("The Studnet Data is : Student Name : "+student.getName()+", Studnet Class : "+student.getClassName()+", Roll number : "+student.getRollNumber());
	}
}

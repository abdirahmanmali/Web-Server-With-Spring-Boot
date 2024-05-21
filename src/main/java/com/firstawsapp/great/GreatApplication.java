package com.firstawsapp.great;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.firstawsapp.great.Algorithm.reverseStringKeepSpecials;

@SpringBootApplication
public class GreatApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatApplication.class, args);


			String inputString = "a,b$c";
			String outputString = reverseStringKeepSpecials(inputString);
			System.out.println(outputString);  // Output should be "c,b$a"
		}
	}

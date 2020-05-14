package com.springeveningfirstdemo.firsteveningprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
public class FirsteveningprogramApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirsteveningprogramApplication.class, args);
	}

//	@GetMapping(value="/check")
//	public String getData(){
//		return "Hello Spring";
//	}

}

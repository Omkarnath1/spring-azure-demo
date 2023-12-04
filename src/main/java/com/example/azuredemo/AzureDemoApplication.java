package com.example.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

	@RequestMapping("/message")
	public String message(){
		return "Congrats on the AZURE DEPLOYMENT with new changes";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}

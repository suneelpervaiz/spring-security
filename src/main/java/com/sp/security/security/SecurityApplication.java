package com.sp.security.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

@RestController
public class SecurityApplication {


    @RequestMapping("/yes")

    public String home(){
        return "hello suneel how are you";
    }



	public static void main(String[] args) {


		System.out.println("build triggers automatucally");

        System.out.println("build triggers iiiii twice");

        System.out.println("build triggers iiiii twice");






        SpringApplication.run(SecurityApplication.class, args);
	}

}

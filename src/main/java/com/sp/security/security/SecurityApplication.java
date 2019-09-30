package com.sp.security.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {


		System.out.println("build triggers automatucally");

        System.out.println("build triggers automatucally twice");



        SpringApplication.run(SecurityApplication.class, args);
	}

}

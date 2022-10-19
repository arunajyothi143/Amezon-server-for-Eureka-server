package com.example.Amezonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class AmezonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmezonServerApplication.class, args);
		System.out.println("hello Eurekha");
	}

}

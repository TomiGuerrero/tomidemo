package com.tomiguerrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TomiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TomiDemoApplication.class, args);
	}
}

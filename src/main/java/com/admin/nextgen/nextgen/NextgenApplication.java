package com.admin.nextgen.nextgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class NextgenApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextgenApplication.class, args);
	}

}

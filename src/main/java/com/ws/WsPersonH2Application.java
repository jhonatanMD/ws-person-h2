package com.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ws.repository")
public class WsPersonH2Application {

	public static void main(String[] args) {
		SpringApplication.run(WsPersonH2Application.class, args);
	}

}

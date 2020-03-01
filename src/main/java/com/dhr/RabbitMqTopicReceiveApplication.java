package com.dhr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqTopicReceiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqTopicReceiveApplication.class, args);
	}

}

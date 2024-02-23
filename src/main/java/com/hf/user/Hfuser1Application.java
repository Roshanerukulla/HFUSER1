package com.hf.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class Hfuser1Application {

	public static void main(String[] args) {
		SpringApplication.run(Hfuser1Application.class, args);
	}

}

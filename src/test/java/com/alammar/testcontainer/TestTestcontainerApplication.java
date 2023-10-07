package com.alammar.testcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestcontainerApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestcontainerApplication::main).with(TestTestcontainerApplication.class).run(args);
	}

}

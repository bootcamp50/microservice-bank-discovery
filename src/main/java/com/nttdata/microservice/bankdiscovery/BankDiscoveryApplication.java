package com.nttdata.microservice.bankdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankDiscoveryApplication.class, args);
	}

}

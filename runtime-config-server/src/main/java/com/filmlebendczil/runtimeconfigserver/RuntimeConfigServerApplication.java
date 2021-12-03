package com.filmlebendczil.runtimeconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;




@SpringBootApplication
@EnableEurekaServer
public class RuntimeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuntimeConfigServerApplication.class, args);
	}

}

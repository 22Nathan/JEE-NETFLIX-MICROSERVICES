package awa.ja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class JaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaApplication.class, args);
	}

}

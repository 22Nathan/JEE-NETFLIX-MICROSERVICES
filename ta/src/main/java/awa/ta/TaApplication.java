package awa.ta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@EnableCircuitBreaker
public class TaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaApplication.class, args);
	}

}

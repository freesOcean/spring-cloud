package cn.boc.privide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrivideApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivideApplication.class, args);
	}

}

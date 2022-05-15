package io.fse.processpensionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProcessPensionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessPensionServiceApplication.class, args);
	}
}
package com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2",
				"controller",
				"repository",
				"entity"
		}
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
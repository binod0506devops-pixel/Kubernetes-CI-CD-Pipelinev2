package com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2",
				"com/nuvora/devopsv2/Kubernetes/CI/CD/Pipelinev2/controller",
				"com/nuvora/devopsv2/Kubernetes/CI/CD/Pipelinev2/repository",
				"com/nuvora/devopsv2/Kubernetes/CI/CD/Pipelinev2/entity"
		}
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
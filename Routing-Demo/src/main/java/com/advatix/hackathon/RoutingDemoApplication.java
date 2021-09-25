package com.advatix.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com")
@EnableAsync
@EnableSwagger2
@EnableJpaRepositories
@EnableWebMvc
@EnableSpringDataWebSupport
public class RoutingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingDemoApplication.class, args);
	}

}

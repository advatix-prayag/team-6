package com.advatix.hackathon.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.advatix.hackathon.utils.ErrorHandler;
import com.advatix.hackathon.utils.LoggerInterceptor;


@Configuration
public class RestTemplateConfig {
	@Bean
	public RestTemplate restTemplate() {
		SimpleClientHttpRequestFactory simpleHttp = new SimpleClientHttpRequestFactory();
		simpleHttp.setConnectTimeout(60000);
		simpleHttp.setReadTimeout(60000);
		ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(simpleHttp);
		RestTemplate restTemplate = new RestTemplate(factory);
		restTemplate.setInterceptors(Collections.singletonList(new LoggerInterceptor()));
		restTemplate.setErrorHandler(new ErrorHandler());
		return restTemplate;
	}
}

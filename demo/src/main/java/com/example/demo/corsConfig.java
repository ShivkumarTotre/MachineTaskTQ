package com.example.demo;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class corsConfig {
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedMethods("Get","Post","Put","Delete")
		.allowedHeaders("*")
		.allowedOrigins("http://localhost:4200");
	}

}

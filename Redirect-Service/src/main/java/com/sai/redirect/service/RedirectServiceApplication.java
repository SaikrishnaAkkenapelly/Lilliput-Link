package com.sai.redirect.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RedirectServiceApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(RedirectServiceApplication.class, args);
	}
}

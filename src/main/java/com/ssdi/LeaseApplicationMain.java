package com.ssdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.ssdi"})
public class LeaseApplicationMain extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LeaseApplicationMain.class, args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LeaseApplicationMain.class);
	}
}

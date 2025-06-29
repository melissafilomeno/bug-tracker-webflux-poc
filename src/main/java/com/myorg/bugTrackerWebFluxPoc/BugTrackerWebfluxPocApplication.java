package com.myorg.bugTrackerWebFluxPoc;

import com.myorg.bugTrackerWebFluxPoc.client.BugClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BugTrackerWebfluxPocApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(BugTrackerWebfluxPocApplication.class, args);
//
//		BugClient bugClient = context.getBean(BugClient.class);
//
//		System.out.println(">> message = " + bugClient.getMessage().block());

		SpringApplication.run(BugTrackerWebfluxPocApplication.class, args);
	}

}

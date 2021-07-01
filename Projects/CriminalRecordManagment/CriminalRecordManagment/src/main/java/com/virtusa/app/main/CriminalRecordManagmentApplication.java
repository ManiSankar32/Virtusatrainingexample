package com.virtusa.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.virtusa.app.config.MvcConfig;
import com.virtusa.app.config.ServiceConfig;

@SpringBootApplication
@EnableJpaRepositories("com.virtusa")
@EntityScan("com.virtusa")
@ComponentScan("com.virtusa.app.controller")
@Import({MvcConfig.class,ServiceConfig.class})
public class CriminalRecordManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriminalRecordManagmentApplication.class, args);
		
	}

}

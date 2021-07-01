package com.Virtusa.app.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Virtusa.app.Config.Appconfig;
import com.Virtusa.app.Config.ServiceConfig;



@SpringBootApplication
@EnableJpaRepositories("com.Virtusa")
@EntityScan("com.Virtusa")
@ComponentScan("com.Virtusa.app.Controller")
@Import({Appconfig.class,ServiceConfig.class})
public class CrimeManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrimeManagmentApplication.class, args);
		
	}

}

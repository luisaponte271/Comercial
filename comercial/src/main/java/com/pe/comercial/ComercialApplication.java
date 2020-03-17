package com.pe.comercial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

	 
//@EnableJpaRepositories(basePackages = "com.pe.comercial.dao.jpa")
@SpringBootApplication
public class ComercialApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ComercialApplication.class, args);
	}		

//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(ComercialApplication.class);
//	}
}

package com.project.template.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages={"com.project.template"})
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewReslover(){
		
		InternalResourceViewResolver viewReslover=new InternalResourceViewResolver();
		viewReslover.setPrefix("/WEB-INF/view/");
		viewReslover.setSuffix(".jsp");
		return viewReslover;
		
	}
}


package com.gs.project.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gs.project.util.ResourceMapper;
import com.gs.project.validation.ProjectValidator;

@Configuration
@EnableTransactionManagement
public class AppConfig {

	@Bean
	@ConfigurationProperties(prefix = "project.datasource")
	public DataSource projectDS() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public ResourceMapper resourceMapper() {
		return new ResourceMapper();
	}
	
	@Bean
	public ProjectValidator projectValidator() {
		return new ProjectValidator();
	}
}
package com.et.web.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
public class MyConfig {
	@Value("${url}")
	private  String url;
	@Value("${driverClass}")
	private  String driverClassName;
	@Value("${password}")
	private  String password;
	@Value("${name}")
	private  String username;
	
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
	return new JdbcTemplate(dataSource);
	}
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dmd =new DriverManagerDataSource();
		dmd.setUrl(url);
		dmd.setDriverClassName(driverClassName);
		dmd.setPassword(password);
		dmd.setUsername(username);
		return dmd;
	}
	
}

package com.example.form;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;

@Component(value = "dataSource")
public class DataSource extends BasicDataSource {
	
	@PostConstruct
	public void DataSourceCreate(){
		setDriverClassName("com.mysql.jdbc.Driver");
		setUrl("jdbc:mysql://localhost:3306/firstdb");
		setUsername("root");
		setPassword("Qwerty789!");
	}

	
	
	
	
}

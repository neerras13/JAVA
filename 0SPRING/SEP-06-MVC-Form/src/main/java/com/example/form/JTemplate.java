package com.example.form;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component(value="jdbcTemplate")
public class JTemplate extends JdbcTemplate {
	
	@Autowired
	DataSource dataSource;

	@PostConstruct
	public void init()
	{
		setDataSource(dataSource);
		
	}
}

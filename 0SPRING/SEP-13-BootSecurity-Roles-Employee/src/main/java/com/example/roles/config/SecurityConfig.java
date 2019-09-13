package com.example.roles.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// adding users
		
		@SuppressWarnings("deprecation")
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("test").password("test123").roles("ADMIN"))
			.withUser(users.username("Isaac").password("test@123").roles("EMPLOYEE"))
			.withUser(users.username("Apple").password("test@@123").roles("MANAGER"));
	}
	
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
				.anyRequest().authenticated()
				//custom login page
				.and()
					.formLogin()
					.permitAll()
			//logout support
				.and()
					.logout()
					.permitAll();
		}
		
		public void configure(WebSecurity web) {
			
			web.ignoring().antMatchers("/console/**");
		}
	}



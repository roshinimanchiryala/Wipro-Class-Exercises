package com.gl.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	//the username,password role
	public UserDetailsService userDetailService() {
		UserDetails user1 = User.withUsername("admin").password("{noop}12345").roles("admin").build();
		UserDetails user2 = User.withUsername("student").password("{noop}12345").roles("student").build();
		UserDetails user3 = User.withUsername("principal").password("{noop}12345").roles("admin","student").build();
		UserDetails user4 = User.withUsername("employee").password("{noop}12345").roles("employee").build();
		return new InMemoryUserDetailsManager(user1, user2, user3, user4);
		
	}
	//Protection on the api  url we create in the controller
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/admin/**").hasRole("admin")
				.requestMatchers("/student/**").hasRole("student")
				.requestMatchers("/general/**").hasAnyRole("admin","student")
				.anyRequest().authenticated()
				).httpBasic();
		return http.build();
	}

}
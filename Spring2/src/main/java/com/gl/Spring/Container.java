package com.gl.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //we are telling our java compiler treat this class as xml configuration
@ComponentScan("com.gl.Spring")
public class Container {
	//function name becomes the id
	@Bean
	@Scope(value = "singleton")
	public Counter getCounter() {
		return  new Counter();
	}

}

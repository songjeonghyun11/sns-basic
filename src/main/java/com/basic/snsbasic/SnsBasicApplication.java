package com.basic.snsbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SnsBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnsBasicApplication.class, args);
	}

}

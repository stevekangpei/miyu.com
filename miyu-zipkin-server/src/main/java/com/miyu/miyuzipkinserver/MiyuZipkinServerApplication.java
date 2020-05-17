package com.miyu.miyuzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZipkinServer
public class MiyuZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiyuZipkinServerApplication.class, args);
	}

}

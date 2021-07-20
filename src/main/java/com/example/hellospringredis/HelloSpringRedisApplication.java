package com.example.hellospringredis;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringRedisApplication {

	private static Logger LOG = Logger.getLogger(HelloSpringRedisApplication.class.getName());

	public static void main(String[] args) {
		LOG.log(Level.INFO, "Starting demo redis app!");
		SpringApplication.run(HelloSpringRedisApplication.class, args);
	}
}

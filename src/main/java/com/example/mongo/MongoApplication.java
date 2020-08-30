package com.example.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * How to run this
 * 1. cd to project folder
 * 2. mkdir mongo-data
 * 3. cd mongo-data
 * 4. mongod --dbpath=.
 * 5. The above steps will start mongod
 * 6. Now run you spring boot application
 * 7. Now access url http://localhost:8095/rest/users/all
 */
@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

}

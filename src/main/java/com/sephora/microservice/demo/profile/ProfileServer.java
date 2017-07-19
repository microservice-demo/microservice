package com.sephora.microservice.demo.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by sanjaymenonc on 7/9/17.
 */
@SpringBootApplication(scanBasePackages = {"com.sephora.microservice.demo.profile"})
@EnableMongoRepositories(basePackages = "com.sephora.microservice.demo.profile.repository")
public class ProfileServer {

    public static void main(String[] args){
        System.setProperty("spring.config.name", "profile-service");
        SpringApplication.run(ProfileServer.class, args);
    }

}

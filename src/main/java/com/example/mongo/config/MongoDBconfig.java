package com.example.mongo.config;


import com.example.mongo.document.Users;
import com.example.mongo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBconfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                userRepository.save(new Users(1,"Ranjeet","AHC Engineering", 200000L));
                userRepository.save(new Users(2,"Abhishek","AHC Engineering", 100000L));
            }
        };
    }
}

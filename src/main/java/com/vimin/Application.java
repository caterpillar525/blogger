package com.vimin;

import com.vimin.entity.Sex;
import com.vimin.entity.User;
import com.vimin.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            repository.save(new User("vimin", Sex.Male));
            repository.save(new User("vina", Sex.Female));
            repository.save(new User("swimming", Sex.Male));

            log.info("Users found with findAll():");
            log.info("-------------------------------");
            for (User user : repository.findAll()) {
                log.info(user.toString());
            }
            log.info("");
            repository.findById(3L)
                    .ifPresent(user -> {
                        log.info("User found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(user.toString());
                        log.info("");
                    });
            log.info("User found with findByLastName('vimin'):");
            log.info("--------------------------------------------");
            repository.findByUserName("vimin")
                    .forEach(user -> {
                        log.info(user.toString());
                    });
            log.info("");
        };
    }
}

package com.example.springclient;

import com.example.springclient.entity.User;
import com.example.springclient.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class SpringClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringClientApplication.class, args);
    }

    UserService userService;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            User user = new User(1L, "qwer", "ty",12);
            User user1 = new User(2L, "qwer2", "ty",13);
            User user2 = new User(3L, "qwer3", "ty",14);


//            userService.createUser(user);
//            userService.createUser(user1);
//            userService.createUser(user2);

            System.out.println(userService.findUserById(3L));

            System.out.println(userService.findAllUsers());

        };
    }
}

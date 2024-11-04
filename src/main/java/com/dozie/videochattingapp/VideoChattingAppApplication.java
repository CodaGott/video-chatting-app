package com.dozie.videochattingapp;

import com.dozie.videochattingapp.service.UserService;
import com.dozie.videochattingapp.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoChattingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoChattingAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            UserService userService
    ){
        return args -> {
            userService.registerUser(User.builder()
                    .username("Dozie")
                    .email("dozie@email.com")
                    .password("password")
                    .build());
            userService.registerUser(User.builder()
                    .username("Miracle")
                    .email("miracle@email.com")
                    .password("password")
                    .build());
        };
    }
}

package com.dozie.videochattingapp.controller;

import com.dozie.videochattingapp.service.UserService;
import com.dozie.videochattingapp.user.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@Slf4j
public class UserController {

    private final UserService userService;

    public void registerUser(User user){
        userService.registerUser(user);
    }

    public User login(User user){
        return userService.login(user);
    }

    public void logout(String email){
        userService.logout(email);
    }
}

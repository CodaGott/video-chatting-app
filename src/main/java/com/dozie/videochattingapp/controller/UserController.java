package com.dozie.videochattingapp.controller;

import com.dozie.videochattingapp.service.UserService;
import com.dozie.videochattingapp.user.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@Slf4j
public class UserController {

    private final UserService userService;
    @PostMapping("/register")
    public void registerUser(User user){
        userService.registerUser(user);
    }
    @PostMapping("/login")
    public User login(User user){
        return userService.login(user);
    }

    @PostMapping("/logout")
    public void logout(String email){
        userService.logout(email);
    }
    @GetMapping()
    public List<User> getAll(){
        return userService.findAll();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception ex){
        ex.printStackTrace();
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ex.getMessage());
    }
}

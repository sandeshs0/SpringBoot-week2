package com.example.cakebooker.controller;

import com.example.cakebooker.entity.User;
import com.example.cakebooker.pojo.UserPojo;
import com.example.cakebooker.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public String saveUser(@Valid @RequestBody UserPojo userPojo){
        userService.saveUser(userPojo);
        return "data created successfully";
    }

}

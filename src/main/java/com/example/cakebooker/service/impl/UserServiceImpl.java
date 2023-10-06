package com.example.cakebooker.service.impl;

import com.example.cakebooker.entity.User;
import com.example.cakebooker.pojo.UserPojo;
import com.example.cakebooker.respository.UserRepository;
import com.example.cakebooker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public void saveUser(UserPojo userPojo) {
        User user = new User();
        System.out.print(userPojo);

        userRepository.save(user);
    }
}

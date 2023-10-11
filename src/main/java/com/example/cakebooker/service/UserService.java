package com.example.cakebooker.service;

import com.example.cakebooker.entity.User;
import com.example.cakebooker.pojo.UserPojo;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(UserPojo userPojo);

    List<User> getAllData();

    Optional<User> getById(Integer id);

    void deleteById(Integer id);
}

package com.example.cakebooker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    private Integer id;
    @Column(name="full_name", nullable = false, length = 255)
    private String fullName;
    @Column(name="user_name", nullable = false)
    private String userName;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="address", nullable = false)
    private String address;
}

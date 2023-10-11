package com.example.cakebooker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name="users")
public class User {

    @Id
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_seq",allocationSize = 1)
    @GeneratedValue(generator="user_seq_gen", strategy = GenerationType.SEQUENCE)
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

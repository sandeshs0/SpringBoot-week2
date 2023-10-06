package com.example.cakebooker.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo {

    private Integer id;

    @NotNull(message = "Full name is required")
    private String fullName;

    @Email
    @NotNull
    private String userName;

    @NotNull
    private String password;

    @NotNull
    private String address;

}

package com.example.hospitaljpa.domain.dto;

import com.example.hospitaljpa.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class UserJoinRequest {
    private String userName;
    private String password;
    private String email;

    public User toEntity(){
        return User.builder()
                .userName(this.userName)
                .password(this.password)
                .emailAddress(this.email)
                .build();
    }

}
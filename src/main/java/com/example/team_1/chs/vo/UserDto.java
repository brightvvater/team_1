package com.example.team_1.chs.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private String userId;
    private String userPass;
    private String userPhoneNumber;

    private String userAddress;

    private String authority;

    public UserDto(){}



}

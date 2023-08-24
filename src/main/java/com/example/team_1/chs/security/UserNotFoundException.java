package com.example.team_1.chs.security;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String userEmail){
        super(userEmail + " NotFoundException");
    }

}

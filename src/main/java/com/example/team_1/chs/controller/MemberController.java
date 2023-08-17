package com.example.team_1.chs.controller;

import com.example.team_1.chs.service.SignUpService;
import com.example.team_1.chs.vo.UserDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MemberController {

    private final SignUpService signUpService;

    @Autowired
    public MemberController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }


    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public ResponseEntity<Void> signUp(@RequestBody UserDto userDto) {

        //System.out.println("signUp");
        signUpService.signUp(userDto);
        return ResponseEntity.ok()
                .build();
    }
}

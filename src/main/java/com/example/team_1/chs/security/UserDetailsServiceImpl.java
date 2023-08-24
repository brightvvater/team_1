package com.example.team_1.chs.security;

import com.example.team_1.chs.vo.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    //private final UserRepository userRepository;

    @Override
    public UserDetailsVO loadUserByUsername(String userEmail) {
        return new UserDetailsVO(new UserDto(),new ArrayList<GrantedAuthority>());
       // return userRepository.findByUserEmail(userEmail)
       // .map(u -> new UserDetailsVO(u, Collections.singleton(new SimpleGrantedAuthority(u.getRole().getValue()))))
       // .orElseThrow(() -> new UserNotFoundException(userEmail));
    }

}

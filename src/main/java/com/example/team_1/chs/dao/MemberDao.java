package com.example.team_1.chs.dao;

import com.example.team_1.chs.vo.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Mapper
public interface MemberDao {

    int insertUser(UserDto dto);
    int insertAuthority(UserDto dto);
}

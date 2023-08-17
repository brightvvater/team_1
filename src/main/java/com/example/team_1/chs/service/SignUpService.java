package com.example.team_1.chs.service;

import com.example.team_1.chs.dao.MemberDao;
import com.example.team_1.chs.exception.CustomException;
import com.example.team_1.chs.exception.ErrorCode;
import com.example.team_1.chs.vo.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SignUpService {

    private final MemberDao dao;

    @Autowired
    public SignUpService(MemberDao dao) {
        this.dao = dao;
    }


    //TODO 1: 회원가입을 한다 / TX 처리
    @Transactional
    public void signUp(UserDto dto){
        int affectedCount = dao.insertUser(dto);
        int affectedCount2 = dao.insertAuthority(dto);
        if(affectedCount==0 || affectedCount2 ==0) {
            throw new CustomException(ErrorCode.SIGN_UP_FAILED);
        }
    }

}

package com.example.team_1.chs.advice;

import com.example.team_1.chs.exception.CustomException;
import com.example.team_1.chs.exception.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class TestingControllerAdvice {

    //TODO 2: signUp 이 실패 했을 경우에 대한 핸들링 처리
    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException e) {
        // 에러에 대한 후처리를 할 수 있습니다. 본 예시에서는 로깅만 진행하였습니다.
        log.error("[handleCustomException] {} : {}",e.getErrorCode().name(), e.getErrorCode().getMessage());
        return ErrorResponse.error(e);
    }

}

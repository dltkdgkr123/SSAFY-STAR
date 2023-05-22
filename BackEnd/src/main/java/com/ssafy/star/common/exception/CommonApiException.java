package com.ssafy.star.common.exception;

import com.ssafy.star.common.util.constant.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommonApiException extends RuntimeException{
    private final ErrorCode errorCode;
}

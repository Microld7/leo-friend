package com.google.exception;

import com.google.common.BaseResponse;
import com.google.common.ErrorCode;
import com.google.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * yupao_backend com.google.exception
 * 2024/4/27 21:07
 * 全局异常处理器
 * @Author LD
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException businessException) {
        log.error("businessException----------" + businessException.getMessage());
        return ResultUtils.error(businessException.getCode(), businessException.getMessage(), businessException.getDescription());
    }
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse exceptionHandler(Exception exception) {
        log.error("runTimException",exception);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR,exception.getMessage(),"");
    }
}

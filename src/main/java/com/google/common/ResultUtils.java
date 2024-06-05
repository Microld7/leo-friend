package com.google.common;

/**
 * yupao_backend com.google.common
 * 2024/4/27 17:15
 * 返回工具类
 * @Author LD
 */
public class ResultUtils {
    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse success(T data) {
        return new BaseResponse<>(0,data,"OK");
    }
    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode,String message,String description) {
        return new BaseResponse<>(errorCode.getCode(),message,description);
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode,String message) {
        return new BaseResponse<>(errorCode.getCode(),null,errorCode.getMessage());
    }

    /**
     * 失败
     * @param
     * @return
     */
    public static BaseResponse error(int code,String message,String description) {
        return new BaseResponse<>(code,null,message,description);
    }
}

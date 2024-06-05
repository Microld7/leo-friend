package com.google.common;

/**
 * yupao_backend com.google.common
 * 2024/4/27 17:27
 * 全局错误码
 * @Author LD
 */
public enum ErrorCode {
    SUCCESS(2000,"请求成功",""),
    PARAMS_ERROR(4000,"请求参数错误",""),
    NULL_ERROR(4001,"请求数据为空",""),
    NOT_LOGIN(4002,"未登录",""),
    NO_AUTH(4003,"无权限",""),
    SYSTEM_ERROR(5000,"系统内部异常",""),
    FORBIDDEN(40301,"禁止操作","");

    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 状态码描述
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    /**
     * get方法，枚举值不支持set
     * @return
     */
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}

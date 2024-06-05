package com.google.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * yupao_backend com.google.domain.request
 * 2024/4/25 23:17
 * 用户登录请求体
 * @Author LD
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 4706184687312963352L;

    private String userAccount;
    private String userPassword;
}

package com.google.constant;

/**
 * yupao_backend com.google.constant
 * 2024/4/26 17:21
 * 用户常量
 * @Author LD
 */

// 接口里里面的属性默认是public static
public interface UserConstant {
    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "userLoginState";

    /**
     * 权限 默认权限、管理员权限
     */
    int DEFAULT_ROLE = 0;
    int ADMIN_ROLE = 1;
}

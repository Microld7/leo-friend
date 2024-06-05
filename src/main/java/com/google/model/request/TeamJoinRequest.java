package com.google.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * yupao_backend com.google.model.request
 * 2024/5/12 17:32
 * 用户加入队伍请求体
 * @Author LD
 */

@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 5409582776444345763L;

    private Long teamId;

    private String password;
}

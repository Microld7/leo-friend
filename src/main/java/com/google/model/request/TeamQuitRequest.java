package com.google.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * yupao_backend com.google.model.request
 * 2024/5/12 20:44
 * 退出队伍请求体
 *
 * @Author LD
 */

@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = -1538913453003385411L;

    private Long teamId;
}

package com.google.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用删除请求体
 * yupao_backend com.google.model.request
 * 2024/5/13 17:00
 * @Author LD
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -7321545992314869704L;

    private long id;
}

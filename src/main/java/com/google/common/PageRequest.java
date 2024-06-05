package com.google.common;

import lombok.Data;

import java.io.Serializable;

/**
 * yupao_backend com.google.common
 * 2024/5/11 22:24
 * 通用分页请求参数
 * @Author LD
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -4908584251286500226L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 页码
     */
    protected int pageNum = 1;
}

package com.xiaob.yupicturebackend.common;

import lombok.Data;

/**
 * @Author: 小脑斧
 * @CreateTime: 2025-05-03
 * @Description:
 * @Version: 1.0
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}


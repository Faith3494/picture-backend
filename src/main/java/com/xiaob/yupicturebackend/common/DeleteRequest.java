package com.xiaob.yupicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 小脑斧
 * @CreateTime: 2025-05-03
 * @Description:
 * @Version: 1.0
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}


package com.xiaob.yupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 小脑斧
 * @CreateTime: 2025-05-08
 * @Description:
 * @Version: 1.0
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 5951545014368561041L;
    /**
     * 账号
     */
    private String userAccount;
    /**
     * 密码
     */

    private String UserPassword;
}

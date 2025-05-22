package com.xiaob.yupicturebackend.controller;

import com.xiaob.yupicturebackend.common.BaseResponse;
import com.xiaob.yupicturebackend.common.ResultUtils;
import com.xiaob.yupicturebackend.exception.ErrorCode;
import com.xiaob.yupicturebackend.exception.ThrowUtils;
import com.xiaob.yupicturebackend.model.dto.user.UserLoginRequest;
import com.xiaob.yupicturebackend.model.dto.user.UserRegisterRequest;
import com.xiaob.yupicturebackend.model.vo.LoginUserVO;
import com.xiaob.yupicturebackend.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 小脑斧
 * @CreateTime: 2025-05-08
 * @Description: 用户接口
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        ThrowUtils.throwIf(userRegisterRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public BaseResponse<LoginUserVO> userLogin(@RequestBody UserLoginRequest UserLoginRequest, HttpServletRequest request) {
        ThrowUtils.throwIf(UserLoginRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = UserLoginRequest.getUserAccount();
        String userPassword = UserLoginRequest.getUserPassword();
        LoginUserVO result = userService.userLogin(userAccount, userPassword, request);
        return ResultUtils.success(result);
    }
}

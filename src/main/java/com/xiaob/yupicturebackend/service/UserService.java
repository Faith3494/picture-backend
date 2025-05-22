package com.xiaob.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaob.yupicturebackend.model.dto.user.UserQueryRequest;
import com.xiaob.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaob.yupicturebackend.model.vo.LoginUserVO;
import com.xiaob.yupicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author xiaob
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-05-08 18:29:18
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密后的密码
     *
     * @param userPassword 用户密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取用户信息
     *
     * @param userAccount 用户账号
     * @param userPassword  用户密码
     * @param request 获取用户信息
     * @return 脱敏后的数据
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获得脱敏后的用
     *
     * @param request 用户
     * @return 脱敏后的数据
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 用户注销
     *
     * @param request 用户
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取登录用户
     *
     * @param request 用户
     * @return 用户
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取用户信息（脱敏）
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获取用户列表
     * @param userList
     * @return
     */
    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}

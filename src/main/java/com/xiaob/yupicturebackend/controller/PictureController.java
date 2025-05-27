package com.xiaob.yupicturebackend.controller;

import com.xiaob.yupicturebackend.annotation.AuthCheck;
import com.xiaob.yupicturebackend.common.BaseResponse;
import com.xiaob.yupicturebackend.common.ResultUtils;
import com.xiaob.yupicturebackend.constant.UserConstant;
import com.xiaob.yupicturebackend.model.dto.picture.PictureUploadRequest;
import com.xiaob.yupicturebackend.model.entity.User;
import com.xiaob.yupicturebackend.model.vo.PictureVO;
import com.xiaob.yupicturebackend.service.PictureService;
import com.xiaob.yupicturebackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/picture")
@RestController
@Slf4j
public class PictureController {

    UserService userService;
    PictureService pictureService;

    /**
     * 上传图片（可重新上传）
     */
    @PostMapping("/upload")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<PictureVO> uploadPicture(
            @RequestPart("file") MultipartFile multipartFile,
            PictureUploadRequest pictureUploadRequest,
            HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        PictureVO pictureVO = pictureService.uploadPicture(multipartFile, pictureUploadRequest, loginUser);
        return ResultUtils.success(pictureVO);
    }

}

package com.xiaob.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaob.yupicturebackend.model.dto.picture.PictureQueryRequest;
import com.xiaob.yupicturebackend.model.dto.picture.PictureUploadRequest;
import com.xiaob.yupicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaob.yupicturebackend.model.entity.User;
import com.xiaob.yupicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author xiaob
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-05-28 04:23:29
*/
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    public QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    public PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    public Page<PictureVO> getPictureVOPage(Page<Picture> picturePage,  HttpServletRequest request);

//    图片数据校验，更新和修改图片进行判断
    public void validatePicture(Picture picture);
}

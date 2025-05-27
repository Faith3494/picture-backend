package com.xiaob.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaob.yupicturebackend.model.dto.picture.PictureQueryRequest;
import com.xiaob.yupicturebackend.model.dto.picture.PictureUploadRequest;
import com.xiaob.yupicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaob.yupicturebackend.model.entity.User;
import com.xiaob.yupicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

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
}

package com.xiaob.yupicturebackend.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class PictureTagCategory {
    /**
     * 标签列表
     */
    private List<String> tagList;

    public List<String> categoryList;
}

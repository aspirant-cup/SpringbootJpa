package com.lyw.service;

import com.lyw.po.Grade;

import java.util.List;

/**
 * 年纪业务逻辑接口
 * @outhor LiYouWei
 * @create 2020/11/28-9:42
 */
public interface GradeService {
    /**
     * 查询全部年纪信息
     * @return
     */
    List<Grade> findAll();
}

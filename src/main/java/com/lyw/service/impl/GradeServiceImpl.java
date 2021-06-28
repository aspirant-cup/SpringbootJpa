package com.lyw.service.impl;

import com.lyw.dao.GradeDao;
import com.lyw.po.Grade;
import com.lyw.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 年级业务逻辑实现类
 * @outhor LiYouWei
 * @create 2020/11/28-9:43
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeDao gradeDao;
    @Override
    public List<Grade> findAll() {
        return gradeDao.findAll();
    }
}

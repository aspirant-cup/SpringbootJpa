package com.lyw.service.impl;

import com.lyw.dao.StudentDao;
import com.lyw.po.Student;
import com.lyw.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑接口实现类
 * @outhor LiYouWei
 * @create 2020/11/28-8:53
 */
@Service
public class StudentServiceImpl implements StudentService {
    /**
     * 注入数据访问接口
     */
    @Resource
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {

        return studentDao.findAll();
    }

    @Override
    public int save(Student student) {
       studentDao.save(student);

        return 0;
    }
    @Override
    public Student findById(int id) {
        return studentDao.findById(id);
    }
    @Override
    public void delete(int id) {
        studentDao.delete(findById(id));

    }
}

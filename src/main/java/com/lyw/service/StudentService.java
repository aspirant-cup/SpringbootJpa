package com.lyw.service;

import com.lyw.po.Student;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 业务逻辑接口
 * @outhor LiYouWei
 * @create 2020/11/28-8:50
 */
public interface StudentService {
    /**
     * 查询全部
     * @return  学生对象集合
     */
    List<Student> findAll();
    /**
     * 增加
     * @param student
     * @return
     */
    int save(Student student);

    /**
     * 根据id 查询
     * @param id
     * @return
     */
    Student findById(int id);
    /**
     * 删除学生信息
     * @param id 学生编号
     * @return  受影响行数
     */
    void delete(int id);


}

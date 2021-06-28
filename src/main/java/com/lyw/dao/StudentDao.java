package com.lyw.dao;

import com.lyw.po.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 学生数据访问接口
 * @outhor LiYouWei
 * @create 2020/11/27-12:04
 */

public interface StudentDao extends JpaRepository<Student,Integer> {
    /**
     * 根据id 查询
     * @param id
     * @return
     */
 Student findById(int id);
}

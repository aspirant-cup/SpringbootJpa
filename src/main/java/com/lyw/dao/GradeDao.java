package com.lyw.dao;

import com.lyw.po.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @outhor LiYouWei
 * @create 2020/11/27-10:47
 */
public interface GradeDao extends JpaRepository<Grade,Integer> {
    /**
     * 根据id查询
     * @param grade_id
     * @return
     */
  Grade findById(int grade_id);

    /**
     * 根据名称查询
     * @param grade_name
     * @return
     */
  List<Grade> findByName(String grade_name);

}

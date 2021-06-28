package com.lyw.dao;

import com.lyw.po.Grade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;


/**
 * springboot测试年级的测试类
 * @outhor LiYouWei
 * @create 2020/11/27-10:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GradeDaoTest {
@Resource
    private GradeDao gradeDao;
    /**
     * 增加
     */
  @Test
    public void testInsert(){
    Grade grade=new Grade();
    grade.setName("五年级");
    gradeDao.save(grade);
}
    @Test
    public void delete(){
        Grade grade=new Grade();
        grade.setId(3);
       gradeDao.delete(grade);
    }
    @Test
    public void update(){
        Grade grade=new Grade();
        grade.setName("八年级");
        grade.setId(1);
        gradeDao.save(grade);
    }
    @Test
    public void findAll(){
        List<Grade> all = gradeDao.findAll();
        System.out.println(all);
    }
    @Test
    public void findAllByid(){
        Grade byId = gradeDao.findById(2);
        System.out.println("byId = " + byId);
    }
    @Test
    public void findAllByName(){
        List<Grade> byName = gradeDao.findByName("一年级");
        System.out.println("byName = " + byName);
    }
    @Test
    public void testPage(){
      gradeDao.findAll(PageRequest.of(0,2)).forEach(System.out::println);
    }
}
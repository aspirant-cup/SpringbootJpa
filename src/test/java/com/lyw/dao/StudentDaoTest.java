package com.lyw.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * 学生springboot测试类
 * @outhor LiYouWei
 * @create 2020/11/27-12:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StudentDaoTest {
@Resource
    private StudentDao studentDao;
        @Test
    public void testFindAll(){
    studentDao.findAll().forEach(System.out::println);
 }
}
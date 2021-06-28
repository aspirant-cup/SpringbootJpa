package com.lyw.po;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 学生实体类
 * @outhor LiYouWei
 * @create 2020/11/27-11:42
 */
@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private Integer id;
    @Column(name = "stu_name",nullable = false)
    private String name;
    @Column(name = "stu_phone",nullable = false)
    private String phone;
    @Column(name = "stu_birth" ,nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    @Column(name = "stu_address" ,nullable = false)
    private String address;
    @ManyToOne(targetEntity = Grade.class)
    @JoinColumn(name = "grade_id",referencedColumnName = "grade_id",nullable = false)
    private Grade grade;
}

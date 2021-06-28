package com.lyw.po;

import lombok.Data;

import javax.persistence.*;


/**
 * 年级实体类
 * @outhor LiYouWei
 * @create 2020/11/27-9:54
 */

@Entity
@Table(name = "grade")
@Data
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    private Integer id;
    @Column(name = "grade_name" ,nullable = false,length = 20)
    private String name;


}

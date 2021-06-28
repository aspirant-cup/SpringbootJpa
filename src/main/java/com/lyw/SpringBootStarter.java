package com.lyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * @outhor LiYouWei
 * @create 2020/11/27-9:52
 */
@SpringBootApplication
public class SpringBootStarter {
    public static void main(String[] args) {
        //spring启动应用
        SpringApplication.run(SpringBootStarter.class,args);
    }
}

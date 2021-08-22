package com.luyuan.miaoshaservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luyuan.miaoshadao.mapper")
public class MiaoshaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaoshaServiceApplication.class, args);
    }

}

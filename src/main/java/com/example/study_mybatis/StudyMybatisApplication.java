package com.example.study_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.study_mybatis"})
@MapperScan("com.example.study_mybatis.mapper")
public class StudyMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyMybatisApplication.class, args);
    }

}

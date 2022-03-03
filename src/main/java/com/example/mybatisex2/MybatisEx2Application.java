package com.example.mybatisex2;

import com.example.mybatisex2.repository.ProductMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackageClasses = MybatisEx2Application.class)
public class MybatisEx2Application {

    private final ProductMapper productMapper;

    public MybatisEx2Application(ProductMapper productMapper){
        this.productMapper = productMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(MybatisEx2Application.class, args);
    }

}

package com.example.mybatisex2.service;

import com.example.mybatisex2.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    @DisplayName("아이디로 검색")
    public void getProductById(){
        Product product = productService.getProductById(1L);
        log.info("product : {}",product);
    }

    @Test
    @DisplayName("ALL 검색")
    public void getAllProducts(){
        List<Product> product = productService.getAllProducts();
        log.info("all products : {}",product);
    }

    @Test
    @Transactional
    @DisplayName("제품 등록")
    public void addProduct(){
        productService.addProduct(new Product("쿤달 샴푸",7900));
        productService.addProduct(new Product("마스크팩",1000));
        productService.addProduct(new Product("티셔츠",5900));
    }
}

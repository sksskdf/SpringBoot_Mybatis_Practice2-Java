package com.example.mybatisex2;

import com.example.mybatisex2.model.Product;
import com.example.mybatisex2.repository.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class MybatisEx2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    ProductMapper productMapper;

    @Test
    public void 조회(){
        Product product = productMapper.selectProductById(1L);
        log.info("1번째 조회 : {}",product);
    }


}

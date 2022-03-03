package com.example.mybatisex2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Slf4j
@Component
public class TestRunner implements ApplicationRunner {
    //Autowired 없이 생성자로 DI
    JdbcTemplate jdbcTemplate;

    DataSource dataSource;

    public TestRunner(JdbcTemplate jdbcTemplate,DataSource dataSource){
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Connection connection = dataSource.getConnection();
        log.info("URL : " + connection.getMetaData().getURL());
        log.info("UserName : " + connection.getMetaData().getUserName());

        /*jdbcTemplate.execute("INSERT INTO products (prod_name,prod_price) values ('버킷햇',6900)");*/

    }
}

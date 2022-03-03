package com.example.mybatisex2.repository;

import com.example.mybatisex2.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    //productMapper.xml 과 충돌이 난다.
    @Select("select * from products where prod_id=#{id}")
    Product selectProductById(Long id);
    List<Product> selectAllProducts();
    void insertProduct(Product product);
}

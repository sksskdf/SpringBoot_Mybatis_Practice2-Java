package com.example.mybatisex2.model;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {

    private Long prod_id;
    @NonNull
    private String prod_name;
    @NonNull
    private int prod_price;
}

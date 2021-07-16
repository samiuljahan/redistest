package com.jahan.samiul.redistest.controller;

import com.jahan.samiul.redistest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@EnableCaching
public class RedisController {
    @Autowired
    RedisTemplate<String, String> redisTemplate;



    @GetMapping("/{id}")
    @Cacheable(key = "#id", value = "Product")
    public Product getProduct(@PathVariable int id){
        //redisTemplate.expire("id", 5, TimeUnit.SECONDS);
        return  getNewproduct();
    }

    private static Product getNewproduct(){
        System.out.println("inserted");
        Product p = new Product();
        p.setId(1);
        p.setName("P Name");
        return p;
    }
}

package com.example.bigevent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * @author xi
 * @create 2024/3/14 12:40
 */
@SpringBootTest//如果在测试类上加了这个注解,将来在单元测试方法执行前会先初始化Spring容器
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void testSet(){
        //往Redis存储一个键值对 StringRedisTemplate
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set("username","zhangsan");
        operations.set("id","1",15, TimeUnit.SECONDS);
    }

    @Test
    public void testGet(){
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        System.out.println(operations.get("username"));

    }
}

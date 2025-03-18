package com.rj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test() {
       redisTemplate.opsForValue().set("User",new User("张三", 18));
        Object o = redisTemplate.opsForValue().get("User");
        System.out.println(o);
    }

}

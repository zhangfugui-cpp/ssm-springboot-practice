package com.hmdp.config;


import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redisson() {
        //配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://172.20.10.3:6379");
        //创建redissonClient对象
        return Redisson.create(config);
    }
}

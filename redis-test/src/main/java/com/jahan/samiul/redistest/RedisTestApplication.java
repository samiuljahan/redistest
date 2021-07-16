package com.jahan.samiul.redistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisTestApplication.class, args);
	}

//	@Bean
//	JedisConnectionFactory jedisConnectionFactory() {
//
////		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
////		redisStandaloneConfiguration.setHostName(env.getProperty("localhost"));
////		redisStandaloneConfiguration.setPort(6379);
//		return new JedisConnectionFactory(/*redisStandaloneConfiguration*/);
//
//	}
//
//	@Bean
//	RedisTemplate<String, String> redisTemplate(/*Environment env*/) {
//
//		RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
//		//redisTemplate.setConnectionFactory(jedisConnectionFactory(/*env*/));
//		return redisTemplate;
//
//	}

}

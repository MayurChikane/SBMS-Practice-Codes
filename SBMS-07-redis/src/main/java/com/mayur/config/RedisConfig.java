package com.mayur.config;

import org.springframework.boot.logging.java.JavaLoggingSystem.Factory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory getconnection() {
		JedisConnectionFactory factory=new JedisConnectionFactory();
//		factory.setHostName(null);
//		factory.setPassword(null);
//		factory.setPort(0);
		return factory;
	}
	
	@Bean
	public RedisTemplate<String, String> getRedisTemplate(JedisConnectionFactory factory){
		RedisTemplate<String, String> rt=new RedisTemplate();
		rt.setConnectionFactory(factory);
		return rt;
		
	}
}

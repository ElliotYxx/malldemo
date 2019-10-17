package com.sheva.malldemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置
 */
@Configuration
@MapperScan("com.sheva.malldemo.mbg.mapper")
public class MyBatisConfig {
}

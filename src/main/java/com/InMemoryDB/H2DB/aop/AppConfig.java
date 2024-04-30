package com.InMemoryDB.H2DB.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.InMemoryDB.H2DB")
@EnableAspectJAutoProxy
public class AppConfig {
    
}

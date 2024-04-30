package com.InMemoryDB.H2DB.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DbAop {
    @Before("execution(* com.InMemoryDB.H2DB.service.*.*(..))")
    public void before() {
        System.out.println("Before method called insert, update, delete, select operation");
    }
}

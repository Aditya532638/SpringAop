package com.example.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvise {

    // Executes before the target method
    @Before("execution(* com.example.aopdemo.EmployeeController.welcome())")
    public void beforeAdvice() {
        System.out.println("Hii...@Before Advice: Executed Before Main Method");
    }
 // Executes before the target method
    @After("execution(* com.example.aopdemo.EmployeeController.welcome())")
    public void afterAdvice() {
        System.out.println("Hii...@After Advice: Executed After Main Method");
    }
    
    @Around("execution(* com.example.aopdemo.EmployeeController.welcome())")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        // Code to run BEFORE the method execution
        System.out.println("Hii...@Around Advice: Executed Before Main Method");

        // Proceed to the target method execution
        Object result = joinPoint.proceed();

        // Code to run AFTER the method execution
        System.out.println("Hii...@Around Advice: Executed After Main Method");

        return result;
    }

}
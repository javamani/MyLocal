package com.towerplus.AopExample.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	


    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.towerplus.AopExample.service.EmployeeService.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint) {
    	System.out.println("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.towerplus.AopExample.service.EmployeeService.getEmployeeById(..))")
    public void logBeforeGetEmployee(JoinPoint joinPoint) {
    	System.out.println("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.towerplus.AopExample.service.EmployeeService.createEmployee(..))")
    public void logBeforeAddEmployee(JoinPoint joinPoint) {
    	System.out.println("****LoggingAspect.logBeforeCreateEmployee() : " + joinPoint.getSignature().getName());
    }
 
    @After("execution(* com.towerplus.AopExample.service.EmployeeService.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint) 
    {
    	System.out.println("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
    }
    
    @After("execution(* com.towerplus.AopExample.service.EmployeeService.getEmployeeById(..))")
    public void logAfterGetEmployee(JoinPoint joinPoint) 
    {
    	System.out.println("****LoggingAspect.logAfterGetEmployee() : " + joinPoint.getSignature().getName());
    }
    
    @After("execution(* com.towerplus.AopExample.service.EmployeeService.addEmployee(..))")
    public void logAfterAddEmployee(JoinPoint joinPoint) 
    {
    	System.out.println("Logging aspect called");
    	System.out.println("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
    }

}

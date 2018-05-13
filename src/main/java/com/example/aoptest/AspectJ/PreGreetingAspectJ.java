package com.example.aoptest.AspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PreGreetingAspectJ  {

    @Before("execution(* greetTo(..))")
    public void beforeGreeting(){
        System.out.println("How are you ");
    }

}

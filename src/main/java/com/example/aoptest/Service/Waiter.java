package com.example.aoptest.Service;

import org.springframework.stereotype.Service;

@Service
public class Waiter {
    public void greetTo(String Customer){
        System.out.println("Waiter:greet to "+Customer);
    }
    public void serveTo(String customer){
        System.out.println("serve to "+customer);
    }
}

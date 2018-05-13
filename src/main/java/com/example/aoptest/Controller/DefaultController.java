package com.example.aoptest.Controller;


import com.example.aoptest.AspectJ.PreGreetingAspectJ;
import com.example.aoptest.Service.Waiter;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @Autowired
    Waiter waiter;
    @RequestMapping("/getName.html")
    public String index(){
        AspectJProxyFactory factory = new AspectJProxyFactory();

        factory.setTarget(waiter);

        factory.addAspect(PreGreetingAspectJ.class);

        Waiter proxy = factory.getProxy();

        proxy.greetTo("john");
        proxy.serveTo("john");
//        waiter.greetTo("john");
//        waiter.serveTo("john");

        return "Index hello";
    }
}

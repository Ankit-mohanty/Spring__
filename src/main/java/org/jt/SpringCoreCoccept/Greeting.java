package org.jt.SpringCoreCoccept;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//it helps to create object .
@Scope("prototype")// here we pass message to create na new object ahter every time..
public class Greeting {
    public Greeting() {
        System.out.println("Object constractor");
    }

    @PostConstruct
//we decalre this to call immediately after the creation of object.
    void init() {
        System.out.println("Custom init method");
    }

    public void greet() {
        System.out.println("Hello ....");
    }

    @PreDestroy
// it use to close the application.
    void close() {
        System.out.println("Destroy method call");
    }
}
/*
- container start-
- Bean instatiation
- Dependecy injection
- Custom init
- close the programme.
*/

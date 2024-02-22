package org.jt.SpringCoreCoccept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication//it is combination of 3 things.@EnableAutoConfiguration=automatically make evrything ready
//@ComponentScan=help to create object in same file.
//@SpringBootConfiguration help to run main method.
//public class SpringCoreCocceptApplication implements CommandLineRunner {
public class SpringCoreCocceptApplication {
    @Autowired
    private Greeting greet;

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(SpringCoreCocceptApplication.class, args);
        //ApplicationContext is use to create and manage the object.
      /*  System.out.println("Welcome To My World");//InterViewBit

        Greeting greetings = ac.getBean(Greeting.class);
        greetings.greet();*/
    }//Spring-starter is use for availebale for essential thhings. We considerr as spring core libreary

    @Bean
    CommandLineRunner commandLineRunner() {//here we create the object of commandlinerunner object. process non static thin in main mathod.

        return args -> {
            greet.greet();
        };
    }

//    @Override
//    public void run(String... args) throws Exception {
//        greet.greet();
//    }
//mainly- spring core concept,spring loging concept,spring yaml concept..
}

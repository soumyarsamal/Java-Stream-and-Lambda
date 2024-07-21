package test.java.com.lambda.test;

import main.java.com.java.Lambda.GreetingService;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        GreetingService greetingService = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hello, " + name + " Welcome!");
            }
        };

        greetingService.greet("Soumya");
        GreetingService greetingService1 = name -> System.out.println("Hello, " + name + " Welcome!");
        greetingService1.greet("John");


        callGreet((name)-> System.out.println(name.toUpperCase(Locale.ROOT) + " is welcome") );
    }

    public static void callGreet(GreetingService g)
    {
        g.greet("Soumya");
    }
}


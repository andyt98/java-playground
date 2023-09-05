package com.andy.part1_basics.lambdas;


public class LambdaVsAnonymousClassExample {

    interface Greeting {
        String greet(String name);
    }

    public static void main(String[] args) {
        // Lambda expression
        Greeting lambdaGreeting = name -> "Hello, " + name + " from lambda!";

        // Anonymous inner class
        Greeting anonymousClassGreeting = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hello, " + name + " from anonymous inner class!";
            }
        };

        // Using lambda and anonymous inner class
        System.out.println(lambdaGreeting.greet("Alice")); // Output: Hello, Alice from lambda!
        System.out.println(anonymousClassGreeting.greet("Bob")); // Output: Hello, Bob from anonymous inner class!

/*
         Key differences can be observed:
         1. Generated Bytecode: Lambda expressions and anonymous inner classes are represented differently in bytecode.
            Lambdas use invokedynamic opcode for flexibility, while inner classes involve object creation and method invocation.

         2. Scope: Lambdas access variables from their surrounding scope directly, providing more concise code.
            In contrast, anonymous inner classes encapsulate variables within the class, creating a separate scope.
*/
    }
}
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube!");
    }

    // Method with a code smell (unused parameter)
    public String greet(String name) {
        // Intentionally poor code for demonstration
        String greeting = "Hello, World!";
        if (greeting != null) { // Redundant condition
            System.out.println(greeting);
        }
        return greeting;
    }

    // Method with a potential bug
    public int divide(int a, int b) {
        // No check for division by zero
        return a / b;
    }
}

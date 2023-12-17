package com.example.kodillabytebuddy;

public class JavaAgentController {

    public static void main(String[] args) {
        createAndDoSomething();
    }

    public static void createAndDoSomething() {
        User user = new User();
        user.doSomething();
    }
}

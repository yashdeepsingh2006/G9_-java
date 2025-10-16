package Lecture10_12_25;

import java.util.*;

public class Compile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = new Person();
        p.eat();
        p.eat("Pizza");
        p.eat("Burger", 2);

        sc.close();
    }
}

class Person {
    void eat() {
        System.out.println("Person eats food");
    }

    void eat(String food) {
        System.out.println("Person eats " + food);
    }

    void eat(String food, int quantity) {
        System.out.println("Person eats " + quantity + " " + food + "(s)");
    }

    void sleep() {
        System.out.println("Person sleeps");
    }

    void code() {
        System.out.println("Person codes");
    }
}
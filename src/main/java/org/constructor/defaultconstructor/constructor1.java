package org.constructor.defaultconstructor;

public class constructor1 {
    int a, b;

    constructor1() {
        System.out.println("A=" + a + "&B=" + b);
        a = 11;
        b = 22;
        System.out.println("A=" + a + "&B=" + b);
        display();
    }

    void display() {
        System.out.println("In display A=" + a + "&B=" + b);

    }

    public static void main(String[] args) {
        new constructor1();
    }
}

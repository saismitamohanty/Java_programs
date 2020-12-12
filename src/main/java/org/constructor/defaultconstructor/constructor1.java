package org.constructor.defaultconstructor;

public class Constructor1 {
    int a, b;

    Constructor1() {
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
        new Constructor1();
    }
}

package org.constructor.overloading;

import java.util.Scanner;

public class constructor3 {
    String name;
    int age;

    constructor3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        name = sc.next();
        System.out.println("Enter the age of the person:");
        age = sc.nextInt();
    }

    constructor3(String x, int a) {
        name = x;
        age = a;
    }

    constructor3(String s) {
        name = s;
        age = 20;
    }

    void display() {
        System.out.println(" Name of the person: " + name + " & Age:" + age);
    }

}

class Test {

    public static void main(String[] args) {
        constructor3 c1 = new constructor3();
        constructor3 c2 = new constructor3("Saismita");
        constructor3 c3 = new constructor3("Swopna", 22);
        c1.display();
        c2.display();
        c3.display();
    }
}

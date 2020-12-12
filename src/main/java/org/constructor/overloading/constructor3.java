package org.constructor.overloading;

import java.util.Scanner;

public class Constructor3 {
    String name;
    int age;

    Constructor3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        name = sc.next();
        System.out.println("Enter the age of the person:");
        age = sc.nextInt();
    }

    Constructor3(String x, int a) {
        name = x;
        age = a;
    }

    Constructor3(String s) {
        name = s;
        age = 20;
    }

    void display() {
        System.out.println(" Name of the person: " + name + " & Age:" + age);
    }

}

class Test {

    public static void main(String[] args) {
        Constructor3 c1 = new Constructor3();
        Constructor3 c2 = new Constructor3("Saismita");
        Constructor3 c3 = new Constructor3("Swopna", 22);
        c1.display();
        c2.display();
        c3.display();
    }
}

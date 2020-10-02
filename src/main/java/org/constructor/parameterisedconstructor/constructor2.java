package org.constructor.parameterisedconstructor;

public class constructor2 {
    String name;
    int age;

    constructor2(String m, int n) {
        name = m;
        age = n;
    }

    void display() {
        System.out.println("Name=" + name + " & age=" + age);
    }

    public static void main(String[] args) {
        constructor2 x = new constructor2("Saismita", 22);
        constructor2 y = new constructor2("Swopna", 23);
        constructor2 z = new constructor2("Nibedita", 21);
        System.out.println("Data of x:");
        x.display();
        System.out.println("Data of y:");
        y.display();
        System.out.println("Data of z:");
        z.display();


    }
}

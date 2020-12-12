package org.constructor.parameterisedconstructor;

public class Constructor2 {
    String name;
    int age;

    Constructor2(String m, int n) {
        name = m;
        age = n;
    }

    void display() {
        System.out.println("Name=" + name + " & age=" + age);
    }

    public static void main(String[] args) {
        Constructor2 x = new Constructor2("Saismita", 22);
        Constructor2 y = new Constructor2("Swopna", 23);
        Constructor2 z = new Constructor2("Nibedita", 21);
        System.out.println("Data of x:");
        x.display();
        System.out.println("Data of y:");
        y.display();
        System.out.println("Data of z:");
        z.display();


    }
}

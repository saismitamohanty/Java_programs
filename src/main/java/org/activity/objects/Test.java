package org.activity.objects;

import java.util.Scanner;

public class Test {
    String name = "Ram";
    int age = 22;

    void setdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:-");
        name = sc.nextLine();
        System.out.println("Enter student age:-");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("Name=" + name + "and Age=" + age);
    }

}

class Sample {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t2.name = "syam";
        t2.age = 21;

        t3.setdata();
        System.out.println("Data of person t1");
        t1.display();
        System.out.println("Data of person t2");
        t2.display();
        System.out.println("Data of person t3");
        t3.display();


    }
}


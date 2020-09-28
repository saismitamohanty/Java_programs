package org.activity.VariableInitialization;

public class Test {
    public static int x;
    public  String y;
    static
    {
        x=20;
        System.out.println("Inside static block");
        System.out.println("x=",+x);
    }
    static void m1()
    {
        x=30;
        System.out.println("Inside static method");
        System.out.println("x="+x);
    }
    {
        y="hello";
        System.out.println("Inside non static block");
        System.out.println("y="+y);
    }
    void m2()
    {
        y="bye";
        System.out.println("Inside non static method");
    }

    public static void main(String[] args) {
        Test var =new Test();
        m1();
        var.m2();

    }
}

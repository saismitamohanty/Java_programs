package org.activity.StaticMethod;

public class Test {

    public static void m1()
    {
        System.out.println("Inside m1()");
    }
    public static void m2()
    {
        System.out.println("Inside m2()");
      m1();
        System.out.println("After calling m1(),Inside m2().");
    }
    static
    {
        System.out.println("Inside static block");
        m1();
        System.out.println("After calling m1(),Inside static block.");
    }
    public static void main(String[] args)
    {
       // Test.m1();
        m1();
        m2();
    }
}

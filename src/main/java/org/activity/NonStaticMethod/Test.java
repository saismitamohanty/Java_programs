package org.activity.NonStaticMethod;

public class Test {
    {
        m1();
    }
    public void m1()
    {
        System.out.println("Inside m1()");
    }
    public void m2()
    {
        System.out.println("Inside m2()");
        m1();
        System.out.println("after calling m1() inside m2()");
    }
    public static void main(String[] args) {
        Test var= new Test();
        var.m1();
        var.m2();

    }
}

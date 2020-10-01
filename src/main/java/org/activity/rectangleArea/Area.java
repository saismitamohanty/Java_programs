package org.activity.rectangleArea;

import java.util.*;

public class Area {
    int l,b;
    public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l and b:");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    public void display()
    {
        System.out.println("l="+l);
        System.out.println("b="+b);
        System.out.println("Area of Rectangle="+(l*b));
    }
    public static void main(String[] args)
    {
        Area obj=new Area();
        obj.get();
        obj.display();
    }
}

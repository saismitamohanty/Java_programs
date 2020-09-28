package org.activity.ParaMeterizedMethods;

public class Test{
    static int total=0;
    static int sum(int x,int y)
    {
        total=x+y;
        return total;
    }

    public static void main(String[] args)
    {
        sum(10,20);
        System.out.println("sum="+total);

    }
}

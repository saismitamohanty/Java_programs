package org.activity.Block;

class Test{
    static int num;

    static{
        System.out.println("Static Block 1");
        num = 100;
    }

    static{
        System.out.println("Static Block 2");
        num = 200;
    }
    public static void main(String args[])
    {
        Test t = new Test();
        System.out.println("Value of num: "+num);
        //System.out.println(t.num);
       // System.out.println(Test.num);


    }
}

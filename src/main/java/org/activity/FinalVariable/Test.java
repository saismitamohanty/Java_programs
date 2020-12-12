package org.activity.FinalVariable;

class Test {
    final static String name = "saismita";

    int rollno;
    public
    static void main(String[] args)
    {
        Test ob = new Test();

      //  ob.name="anushka";  //Name should be constant..

        ob.rollno =20;

        System.out.println(ob.name);

        System.out.println(ob.rollno);
    }
}
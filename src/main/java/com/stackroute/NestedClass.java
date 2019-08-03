package com.stackroute;


public class NestedClass {

    //static vaiables
    static int x=10;
    static int y=20;

    //inner class
    public static class innerClass{
        void display(){
            System.out.println(+y);
            System.out.println(+x);
        }
    }

}

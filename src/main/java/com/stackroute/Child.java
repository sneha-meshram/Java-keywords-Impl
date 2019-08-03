package com.stackroute;

//this child inherit the class parent

public class Child extends Parent {

    String name;


    public void showFamily(String title, String religion, String name){
        System.out.println("the name of a child is "+name);
        System.out.println("the family name is " +title);
        System.out.println("the religion is " +religion);
    }
}

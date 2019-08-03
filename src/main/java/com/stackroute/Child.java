package com.stackroute;

//this child inherit the class parent

public class Child extends Parent {

    String name;
    int age;

    //hiding the parent showFamily()
    //overidding the parent method
    public void showFamily(String title, String religion, String name){
        System.out.println("the name of a child is "+name);
        System.out.println("the family name is " +title);
        System.out.println("the religion is " +religion);
    }

    //overloading the method
    public void showFamily(int age) {
        System.out.println("the age of child is "+age);
    }
}

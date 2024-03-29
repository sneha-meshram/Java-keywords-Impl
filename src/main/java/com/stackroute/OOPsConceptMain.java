package com.stackroute;

import com.stackroute.myPackage.Badminton;

public class OOPsConceptMain {

    public static void main(String[] args) {

        //creating object for Details class.
        Details details=new Details();
        details.setName("Sneha Meshram");
        System.out.println(details.message);
        System.out.println("the name is " +details.getName());

        //creating object of Crow Class.

        Crow crow=new Crow();
        crow.showName("sparror");
        crow.showColor("brown");
        crow.showData();

        //creating object of Child Class.
        Child child=new Child();
        child.showFamily("meshram","buddhist","sneha");
        child.showFamily(1);

        //creating object for Badminton class by importing package myPackage
        Badminton badminton=new Badminton();
        badminton.sportsDetail("yonex","saina nehwal");


        NestedClass.innerClass nestedobj=new NestedClass.innerClass();
        System.out.println("Nested class value ");
        nestedobj.display();

        //creating instance of Car class.
        CarDemo carDemo=new CarDemo("company","fuel","name");
        carDemo.carComapny();
        carDemo.carFuel();
        carDemo.carName();

    }

}

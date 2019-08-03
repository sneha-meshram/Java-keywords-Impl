package com.stackroute;

public class OOPsConcept {

    public static void main(String[] args) {

        //creating object for Details class.
        Details details=new Details();
        details.setName("Sneha Meshram");
        System.out.println("the name is " +details.getName());

        Crow crow=new Crow();
        crow.showName("sparror");
        crow.showColor("brown");
        crow.showData();

        Child child=new Child();
        child.showFamily("meshram","buddhist","sneha");
    }

}

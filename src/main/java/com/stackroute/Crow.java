package com.stackroute;

//this class implements the interface Birds

class Crow implements Birds {

    String name;
    String color;

    //overridding the showName method Interface Birds.
    public void showName(String name)
    {
        this.name = name;
    }
    //overridding the showColor method Interface Birds.
    public void showColor(String color)
    {
        this.color = color;
    }

    public void showData(){
        System.out.println("the name is " +name + " and color is " +color);
    }

}


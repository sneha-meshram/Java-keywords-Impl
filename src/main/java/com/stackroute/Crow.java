package com.stackroute;

class Crow implements Birds {

    String name;
    String color;

    public void showName(String name)
    {
        this.name = name;
    }

    public void showColor(String color)
    {
        this.color = color;
    }

    public void showData(){
        System.out.println("the name is " +name + " and color is " +color);
    }

}


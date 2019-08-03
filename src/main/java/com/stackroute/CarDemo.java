package com.stackroute;

public class CarDemo extends Car {

    //  public static void main(String[] args) {
    String company;
    String fuel;
    String name;

    public CarDemo(String company, String fuel, String name) {
        this.company = "hundai";
        this.fuel = "petrol";
        this.name = "santro";
    }

    @Override
    public void carComapny() {
        System.out.println("company name is " + company);

    }

    @Override
    public void carFuel() {
        System.out.println("fuel used is " + fuel);
    }

    @Override
    public void carName() {
        System.out.println("car name is " + name);
    }
}

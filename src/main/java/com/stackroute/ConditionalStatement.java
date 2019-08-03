package com.stackroute;

public class ConditionalStatement {

    public static void main(String[] args) {
        int a = 200;
        int b = 600;
        int c = 500;

        //check among three numbers which is greater.

        if (a> b && a > c)
            System.out.println("a is largest.");
        else if (b > a && b > c)
            System.out.println("b is largest.");
        else if (c > a && c > b)
            System.out.println("c is largest.");
        else
            System.out.println("The numbers are not distinct.");


        int number =10 ;

        // check till number is less than 15
        while (number < 15)
        {
            System.out.println("the numbers are:" + number);

            number++;
        }

        //print array using loop.

        int length;
        int[] arr={2,3,4,5};
        length= arr.length;
        for(int i=0;i<length;i++){
            System.out.println("values of array are are" +arr[i]);
        }
    }

}

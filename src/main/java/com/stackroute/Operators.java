package com.stackroute;

public class Operators {
    public static void main(String[] args) {

        int month1 = 0;
        int month2 = 0;

        //OR operators
        boolean result = (month2 == 29) || month1 == 2014;
        System.out.println("leap year : "+result);

        int month3 = 29;
        int month4 = 2014;

        //AND operators
        boolean result1 = (month3 == 29) && month4 == 2016;
        System.out.println("leap year 1: "+result1);

        int month5= 29;
        int month6 = 2014;

        boolean result2 = (month3 == 29) && month4 == 2014;
        System.out.println("leap year 2 : "+result2);

        int month7 = 16;
        int month8 = 2014;

        //And and NOT Equal operators
        boolean result3 = (month7 <= 29) && month8!= 2016;
        System.out.println("leap year 3: "+result3);

      //using Bitwise operator.
        int result4 = 2;
        System.out.println("bitwise is "+ ~(result4));

        int month9= 16;

        //ternary operator
        int result5=month9==0? 0: month9;
        System.out.println("result 5 is "+result5);


    }
}


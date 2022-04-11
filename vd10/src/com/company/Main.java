package com.company;

public class Main {

    public static void main(String[] args) {
	    int number1 = 98;
        int number2 = 5;
        int sum,difference, product, quotient,remainder;
        sum = number1 + number2;
        difference = number1-number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.printf("the sum, difference,product,quotient and remainder o");
        System.out.printf("number1");
        System.out.printf("and");
        System.out.printf("number2");
        System.out.printf("are");
        System.out.printf("sum");
        System.out.printf(",");
        System.out.printf("product");
        System.out.printf(",");
        System.out.printf("quotient");
        System.out.printf(",and");
        System.out.printf("remainder");

        ++number1;

        --number2;
        System.out.printf("number1 after increment is " + number1);
        System.out.printf("number2 after increment is " + number2);
        quotient = number1 / number2;
        System.out.printf("The new quotient of" + number1 + "and" + number2
        + "is" + quotient );
    }
}

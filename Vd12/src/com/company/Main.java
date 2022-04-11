package com.company;

public class Main {

    public static void main(String[] args) {
        int lowerbuond = 1 , upperbuond = 1000;
        int sumOdd = 0 ;
        int sumEven = 0;
        int number = lowerbuond ;
        while (number <= upperbuond){
            if ( number % 2 == 0){
                sumEven += number;
            } else {
                sumOdd += number;
            }
            ++number;
        }
        System.out.printf("The sum of odd numbers from" + lowerbuond + "to" + upperbuond + "is" + sumOdd);
        System.out.printf("The sum of odd numbers from" + lowerbuond + "to" + upperbuond + "is" + sumEven);
        System.out.printf("The difference between the two sums is" + (sumOdd - sumEven));
   }
}
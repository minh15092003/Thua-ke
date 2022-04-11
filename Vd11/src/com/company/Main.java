package com.company;

public class Main {

    public static void main(String[] args) {
	int lowerbound = 1 ;
    int loperbound = 1000;
    int sum = 0 ;
    int number = lowerbound;
    while (number <= upperbound){
        sum = sum + number;
        ++number;
    }
        System.out.printf("The sum from " + lowerbound + "to" + upperbound + "is" + sum);
    }
}

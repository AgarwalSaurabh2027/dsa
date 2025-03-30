package com.saurabh.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(factorialByLoop(num1));
        System.out.println(factorialByRecursion(num1));

    }

    private static int factorialByRecursion(int num1) {
    if(num1==0)
        return 1;
    else
        return num1 * factorialByRecursion(num1-1);
    }

    private static int factorialByLoop(int num1) {
        int fact =1;
        if(num1==0) return 1;
        for(int start=1;start<=num1;start++){
            fact=fact*start;
        }
        return fact;
    }

}

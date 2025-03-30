package com.saurabh.basics;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of N");
        int num1 = scan.nextInt();
        System.out.println(findSumLoop(num1));
        System.out.println(findSumFormula(num1));
        System.out.println(findSumRecursion(num1));
    }

    private static int findSumRecursion(int num1) {

        if(num1==0)
            return 0;
        else
           return num1 +findSumRecursion(num1-1);

    }

    private static int findSumFormula(int num1) {
        return ((num1 *(num1+1))/2);
    }

    private static int findSumLoop(int num1) {
        int sum=0;
        for(int start=1;start<=num1;start++){
            sum=sum+start;
        }
        return sum;
    }
}

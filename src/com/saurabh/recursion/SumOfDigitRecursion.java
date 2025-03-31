package com.saurabh.recursion;

import java.util.Scanner;

public class SumOfDigitRecursion {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(findSum(num));
    }

    private static int findSum(int num) {
    if(num==0){
      return 0;
    }
    else
        return num%10+findSum(num/10);
    }
}

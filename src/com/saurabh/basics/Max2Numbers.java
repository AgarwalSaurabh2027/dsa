package com.saurabh.basics;

import java.util.Scanner;
public class Max2Numbers {

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2= scan.nextInt();

        System.out.println(findMaxConditional(num1,num2));
        System.out.println(findMaxTernary(num1,num2));
        System.out.println(findMaxInbuilt(num1,num2));
    }

    private static int findMaxInbuilt(int num1, int num2) {
        return Math.max(num1,num2);
    }

    private static int findMaxTernary(int num1, int num2) {
       return (num1>num2)?num1:num2;
    }

    private static int findMaxConditional(int num1, int num2) {
        if(num1>num2)
            return num1;
        return num2;
    }
}

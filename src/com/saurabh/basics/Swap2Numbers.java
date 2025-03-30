package com.saurabh.basics;

import java.util.Scanner;

public class Swap2Numbers {

    static void swap3rdVariable(int a, int b) {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("num1 = "+a+" num2 = "+b);

    }

    static void swapAddSub(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("num1 = "+a+" num2 = "+b);
    }

    static void swapMultDiv(int a, int b) {
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("num1 = "+a+" num2 = "+b);
    }

    static void swapBitwise(int a, int b) {
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("num1 = "+a+" num2 = "+b);
    }

    private static void swapSingleLine(int a, int b) {
        a=(a+b)-(b=a);
        System.out.println("num1 = "+a+" num2 = "+b);
    }

    public static void main(String[] args) {

        System.out.println("Enter 2 numbers");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        swap3rdVariable(num1, num2);
        swapAddSub(num1, num2);
        swapMultDiv(num1, num2);
        swapBitwise(num1, num2);
        swapSingleLine(num1,num2);
        scan.close();
    }


}

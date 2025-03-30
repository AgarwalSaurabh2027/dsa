package com.saurabh.basics;

import java.util.Scanner;

public class Max3Numbers {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(findMaxTernary(num1,num2,num3));
        System.out.println(findMaxInbuilt(num1,num2,num3));

    }

    public static int findMaxTernary(int num1,int num2, int num3){

        return (num1>num2)?num1:(num2>num3)?num2:num3;

    }
    public static int findMaxInbuilt(int num1,int num2, int num3){
        return Math.max(Math.max(num1,num2),num3);
    }
}

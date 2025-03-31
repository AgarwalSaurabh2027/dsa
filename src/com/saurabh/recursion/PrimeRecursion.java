package com.saurabh.recursion;

import java.util.Scanner;

public class PrimeRecursion {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(checkPrime(num,num/2));
    }

    private static boolean checkPrime(int num, int i) {
        if(i==1)
            return true;
        else if(num%i==0)
            return false;
        else
            return checkPrime(num,--i);
    }
}

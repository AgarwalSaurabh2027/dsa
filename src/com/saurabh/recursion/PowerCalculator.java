package com.saurabh.recursion;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int pow = scan.nextInt();
        System.out.println(calculatePower(num,pow));
    }

    private static int calculatePower(int num, int pow) {
        if (pow==0)
            return 1;
        else
            return num*(calculatePower(num,pow-1));
    }
}

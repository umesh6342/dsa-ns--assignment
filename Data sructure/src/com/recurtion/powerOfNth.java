package com.recurtion;

import java.util.Scanner;

public class powerOfNth {
    public static int power(int n,int p){
        if (p==0){
            return 1;
        }
        int prevPower = power(n,p-1);
        return n*prevPower;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(power(n,p));

    }
}

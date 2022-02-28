package com.recurtion;

import java.util.Scanner;

public class sumOfNumber {
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        //int prevsum = sum(n-1);
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum1 = sc.nextInt();
        System.out.println(sum(sum1));


    }
}

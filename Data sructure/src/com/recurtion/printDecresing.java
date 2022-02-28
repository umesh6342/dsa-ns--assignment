package com.recurtion;

import java.util.Scanner;

public class printDecresing {
    public static void pd(int n){
        if (n==0){ // base case where your program will terminating.
            return;
        }

        pd(n-1);// recurstive call
        System.out.print(n+" ");//increasing order

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        pd(n);

    }
}

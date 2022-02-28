package com.recurtion;

import java.util.Scanner;

public class print1Ton {

    public static int print(int n){
        if(n==0){
            return 0;


        }
        System.out.print(n +" ");

       return print(n-1);



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        print(n);

    }
}

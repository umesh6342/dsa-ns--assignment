package com.sortingalgo;

public class bubbleSort {
    public static void printAraary(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSortArray(int arr[],int size){
        for (int i=0;i<size-1;i++){

            for (int j=0;j<size-i-1;j++){
                if (arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j]=arr[j+1];

                    arr[j+1]=temp;


                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= {8,5,7,3,4};
        bubbleSortArray(arr,5);
        printAraary(arr,5);


    }
}

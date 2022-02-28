package com.recurtion;

public class sumOfArray {
    public static int getSum(int arr[],int size){
        if (size==0){
            return 0;

        }

        if ( size == 1){
            return arr[0];
        }
        int remaingpart = getSum(arr,size-1);
        int sum = arr[0]+ remaingpart;
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={2,4,9,9,8};
        int size = 5;
        int sum = getSum(arr,size);
        System.out.println(sum);
    }
}

package com.recurtion;
// cheack array is given to you sorted or not

public class isSorted1 {

    public static boolean isSorted(int arr[],int size){

        if (size == 0 || size ==1 ){
            return true;

        }
        if (arr[0]>arr[1])
            return false;

        else{


            boolean remaingPart = isSorted(arr,size-1);
            return remaingPart;
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,4,1,8,9};


        int size =5;
        boolean ans = isSorted(arr,size);
        if (ans){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("not sorted");
        }

    }
}

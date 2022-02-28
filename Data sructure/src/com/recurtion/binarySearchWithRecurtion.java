package com.recurtion;

public class binarySearchWithRecurtion {
    public static int binarySearch(int arr[],int s,int e,int k){
        if (s>e)
            return -1;
       // System.out.println("not present");
        int mid = s +(e-s)/2;

        if (arr[mid]==k)
            return mid;
        if (k>arr[mid]){
            return binarySearch(arr,mid+1,e,k);
        }
        else{
            return binarySearch(arr,s,mid-1,k);
        }
    }

    public static void main(String[] args) {
        int arr[] ={2,4,6,10,14,18};

        int size =5;
        int k =2;
        int ans = binarySearch(arr,0,4,  k);
        System.out.println( "element present at the index"+ " "  +ans);
    }
}

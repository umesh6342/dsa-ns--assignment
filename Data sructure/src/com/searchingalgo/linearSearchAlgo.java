package com.searchingalgo;

public class linearSearchAlgo {
    static int linearSearch(int[] arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[]={5,7,2,1,11,8};
        linearSearch(arr,2);
        printArray(arr);

    }


}

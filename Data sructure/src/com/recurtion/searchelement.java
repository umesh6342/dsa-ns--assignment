package com.recurtion;

public class searchelement {
    public static int linearSearch(int arr[],int l,int r,int k){
        if (r<1)

            return -1;
        if (arr[l]==k) return l;
        if (arr[r] ==k)
            return k;
        return linearSearch(arr,l+1,r-1,k);
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 2, 3};
        int k =3;

        int index = linearSearch(arr, 0, arr.length-1, k);
        if (index != -1)
            System.out.println("Element " + k + " is present at index " +
                    index);
        else
            System.out.println("Element " + k + " is not present");


    }
}

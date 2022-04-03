package com.company;

//Time Complexity = O(n)
public class IsSorted2 {
    public static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return isSorted(arr,i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,99,9};
        System.out.println(isSorted(arr,0));
    }
}

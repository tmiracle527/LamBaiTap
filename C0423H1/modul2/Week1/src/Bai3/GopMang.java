package Bai3;


import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr= {8,7,6,5};
        int[] arr2= {1,2,3,4};
        int[] newArr= mergeArray(arr,arr2);
        System.out.println("mang 1: "+ Arrays.toString(arr));
        System.out.println("mang 2: "+ Arrays.toString(arr2));
        System.out.println("mang gop: "+Arrays.toString(newArr));
    }
    public static int[] mergeArray(int[] arr, int[] arr2){
        int[] newArr=new int[arr.length+arr2.length];
        for (int i =0; i< newArr.length;i++){
            if (i<arr.length)newArr[i]=arr[i];
            else newArr[i]=arr2[i- arr.length];
        }
        return newArr;
    }
}
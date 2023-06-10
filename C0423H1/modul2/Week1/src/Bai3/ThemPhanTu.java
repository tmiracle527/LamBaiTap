package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr= {5,4,2,6,4,5,7,9};
        System.out.println("Nhap So Them: ");
        int newValue= scanner.nextInt();
        System.out.println("Nhap Vi Tri Them: ");
        int index= scanner.nextInt();
        int[] newArr= insertValue(arr,newValue,index);
        System.out.println("Mang Da Them: "+ Arrays.toString(newArr));
    }
    public static int[] insertValue(int[] arr, int newValue, int index){
        if (index<0 || index >arr.length) return arr;
        int[] newArr= new int[arr.length+1];
        newArr[index]=newValue;
        for(int i = 0; i<newArr.length; i++){
            if(i < index) newArr[i] = arr[i];
            else if(i > index) newArr[i] = arr[i-1];
        }
        return newArr;
    }
}

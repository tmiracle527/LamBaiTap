package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr= {4,2,3,5,6,1};
        System.out.print("Vi tri muon xoa: ");
        int index= scanner.nextInt();
        int[] newArr= removeValue(arr,index);
        System.out.println("Bang da xoa: "+ Arrays.toString(newArr));
    }

    public static int[] removeValue(int[] arr, int index) {
        if (index<0 || index> arr.length) return arr;
        int[] newArr = new int[arr.length-1];
        for(int i = 0; i < newArr.length; i++){
            if(i < index) newArr[i] = arr[i];
            else newArr[i] = arr[i+1];
        }
        return newArr;
    }
}

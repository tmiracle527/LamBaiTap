package Bai3;

public class Mang2Chieu {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int max= findMax(arr);
        System.out.println("Max: "+max);
    }
    public static int findMax(int[][] arr){
        int max= arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) max = anInt;
            }
        }
        return max;
    }
}
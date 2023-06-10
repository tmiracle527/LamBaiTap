package Bai3;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 6, 1, 2};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}

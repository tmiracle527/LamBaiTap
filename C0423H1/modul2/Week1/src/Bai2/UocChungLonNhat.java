package Bai2;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap a: ");
        a= input.nextInt();
        System.out.println("Nhap b: ");
        b= input.nextInt();
        while (a!=b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}

package Bai1;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args){
        double vnd= 23000;
        double usd;
        Scanner td= new Scanner(System.in);
        System.out.print("Nhap So USD: ");
        usd= td.nextDouble();
        double quydoi= usd*vnd;
        System.out.print("Gia Tri VND: " + quydoi);
    }
}

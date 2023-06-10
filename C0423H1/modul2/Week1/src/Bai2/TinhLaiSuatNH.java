package Bai2;

import java.util.Scanner;

public class TinhLaiSuatNH {
    public static void main(String[] args) {
        double tien= 1.0;
        int thang= 1;
        double lai= 1.0;
        Scanner input= new Scanner(System.in);
        System.out.println("So Tien: ");
        tien = input.nextDouble();
        System.out.println("Nhap So Thang: ");
        thang = input.nextInt();
        System.out.println("Ti Gia Lai: ");
        lai = input.nextDouble();
        double tienLai = 0;
        for(int i = 0; i < thang; i++){
           tienLai += tien * (lai/100)/12 * thang;
        }
        System.out.println("Tong lai: " + tienLai);
    }
}

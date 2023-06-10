package Bai2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap So: ");
        int number= scanner.nextInt();
        if (number<2) {
            System.out.print(number + " Khong Phai SNT");
        }else {
            int i=2;
            boolean check= true;
            while (i<= Math.sqrt(number)){
                if (number%i==0){
                    check= false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number +" La SNT");
            else
                System.out.println(number +" Khong La SNT");
        }
    }
}

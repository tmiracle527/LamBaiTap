package Bai4_2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a= scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b= scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c= scanner.nextDouble();
        if (a==0){
            System.out.println("PT Bac 1");
        } else {
            QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
            if (quadraticEquation.getDiscriminant()<0 ){
                System.out.println("Vo Nghiem");
            } else if (quadraticEquation.getDiscriminant()==0) {
                System.out.println("Nghiem Kep x1=x2=" +quadraticEquation.root());
            }else {
                System.out.printf("2 Nghiem x1= %.3f x2= %.3f", quadraticEquation.root(),quadraticEquation.root2());
            }
        }
    }
}

package Bai2;

import static Bai2.SNT.isPrime;

public class SNT_100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

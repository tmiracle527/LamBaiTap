package Bai2;

public class SNT {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 2; ; i++) {
            boolean isPrime;
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            if (count > 20)
                break;
        }
    }

    public static boolean isPrime(int number) {
        int i;
        for (i = 2;i <= Math.sqrt(number);
        i++){
            if (number % i == 0) return false;
        }
        return number > 1;
    }
}

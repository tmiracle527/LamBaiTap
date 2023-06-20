import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.print("So Can Kiem Tra: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        checkOdd(num);
    }

    public static void checkOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        } else System.out.println("odd");
    }
}

import java.util.Scanner;


public class BanhDaNem {
    public static void main(String[] args) {
        System.out.print("So Banh Da Nem: ");
        Scanner scanner = new Scanner(System.in);
        int roll = scanner.nextInt();
        System.out.println(frying(roll));
    }
    public static int frying(int roll) {
        int time;
        if (roll % 9 == 0) {
            time = roll / 9;
        } else time = roll / 9 + 1;
     return time;
    }
}

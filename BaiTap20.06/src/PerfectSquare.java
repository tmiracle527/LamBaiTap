import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println("enter a: ");
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("enter b: ");
        Scanner scanner1= new Scanner(System.in);
        int b= scanner1.nextInt();
        for (int i=a;i<=b;i++){
            if (isPerfectSquare(i)){
                System.out.print( i+ ", ");
            }
        }
    }
    public static boolean isPerfectSquare(int num){
        int sqrt=(int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
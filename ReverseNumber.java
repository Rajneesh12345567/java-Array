import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int a, b;
        int d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any no.");
        a = sc.nextInt();
        while (a > 0)
            b = a % 10;
        a = a / 10;
        d = (d * 10) + b;

    }

}

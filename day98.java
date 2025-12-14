package pkg100dayscoding2025;
import java.util.Scanner;
public class day98 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = aa.nextInt();

        int a = 0, b = 1;

        System.out.println("Deretan Fibonacci dari 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}

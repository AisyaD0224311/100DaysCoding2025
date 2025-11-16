package pkg100dayscoding2025;
import java.util.Scanner;
public class day70 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        int p = aa.nextInt();
        System.out.print("Masukkan lebar : ");
        int l = aa.nextInt();
        int S = l - 2;
        for (int i = 0; i < p; i++) {
            System.out.print("|");
            for (int j = 0; j < S; j++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }
}

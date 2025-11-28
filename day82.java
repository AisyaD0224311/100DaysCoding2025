package pkg100dayscoding2025;
import java.util.Scanner;
public class day82 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int [] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            a[i] = aa.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index ke-" + i + " : " + a[i]);
        }
    }
}

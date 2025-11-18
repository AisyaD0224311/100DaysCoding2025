package pkg100dayscoding2025;

import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = aa.nextInt();
        for (int i = a; i > 0; i--) {
            for (int s = 0; s < a - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

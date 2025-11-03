package pkg100dayscoding2025;

import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = aa.nextInt();
        if (a > 0) {
            for (int i = 1; i <= a; i++) { 
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if (a < 0) {
            a = Math.abs(a);
            for (int i = a; i >= 1; i--) { 
                for (int j = 1; j <= i; j++) { 
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("Kosong");
        }
    }
}

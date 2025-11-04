package pkg100dayscoding2025;

import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat N: ");
        int N = aa.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            jumlah += i;
            System.out.print(i);
            if (i < N) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + jumlah);

        int kali = 1;
        for (int i = N; i >= 1; i--) {
            kali *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print("*");
            }
        }
        System.out.println(" = " + kali);
    }
}


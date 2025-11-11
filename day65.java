package pkg100dayscoding2025;

import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int N = aa.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= N; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial : " + faktorial);
    }
}

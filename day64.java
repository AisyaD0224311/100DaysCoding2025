package pkg100dayscoding2025;

import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int M = aa.nextInt();
        System.out.print("Masukkan pangkat : ");
        int N = aa.nextInt();
        int hasil = 1;
        for (int i = 1; i <= N; i++) {      
            hasil *= M;
        }
        System.out.println("Hasil " + M + " pangkat " + N + " = " + hasil);
    }
}

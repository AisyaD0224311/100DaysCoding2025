package pkg100dayscoding2025;

import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan nilai kelipatan (M) : ");
        int M = aa.nextInt();
        System.out.print("Masukkan nilai batas akhir (N) : ");
        int N = aa.nextInt();
        System.out.print("Bilangan kelipatan " + M + " dari 1 sampai " + N + " : \n");
        for (int i = 1; i <= N; i++) {
            if(i %M == 0){
                System.out.println(i + " ");
            }
        }
    }
}

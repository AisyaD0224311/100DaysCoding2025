package pkg100dayscoding2025;

import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = aa.nextInt();
        int t = 1;
        for (int i = 1; i <= N; i++) {
            t *= i;
            System.out.print(i);
            if(i < N){
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + t);
    }
}

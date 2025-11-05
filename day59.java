package pkg100dayscoding2025;

import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int N = aa.nextInt();
        for (int i = 1; i <= N; i++) {
            if(i %2 == 0){
              System.out.print(i);
              if(i < N - 1){
                System.out.print("-");
              }
            }
        }
        System.out.println();
        for (int i = N; i >= 1; i--) {
            if(i %2 == 1){
              System.out.print(i);
              if(i > 1){
                System.out.print("-");
              }
            }
        }
    }
}

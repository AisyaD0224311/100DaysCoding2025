package pkg100dayscoding2025;

import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int j = 0;
        for(;;){
            System.out.print("Masukkan angka : ");
            int a = aa.nextInt();
            if(a < 0){
                j += Math.abs(a);
                break;
            }
            j += a;
        }
        System.out.println(j);
    }
}

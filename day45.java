package pkg100dayscoding2025;

import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan nilai predikat anda (A, B, C, D, E) : ");
        char a = aa.next().toUpperCase().charAt(0);
        switch(a){
            case 'A' :
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            case 'E':
                System.out.println("Sangat Kurang");
                break;
            default:
                System.out.println("Tidak termasuk kategori");
                break;
        }
    }
}

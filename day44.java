package pkg100dayscoding2025;

import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int a = aa.nextInt();
        if(a <= 100 && a >= 85){
            System.out.println("Nilai A");
        }else if(a < 85 && a >= 75){
            System.out.println("Nilai B");
        }else if(a < 75 && a >= 60){
            System.out.println("Nilai C");
        }else if(a < 60 && a >= 50){
            System.out.println("Nilai D");
        }else{
            System.out.println("Nilai E, Error HAHAAHHA");
        }
    }
}

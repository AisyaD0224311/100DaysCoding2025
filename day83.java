package pkg100dayscoding2025;

import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan sesi belajar : ");
        int sesi = aa.nextInt();
        int jam = 0;
        int menit = 0;
        int detik = 0;
        for (int i = 0; i < sesi; i++) {
            System.out.println("Sesi ke-" + (i + 1));
            System.out.print("Jam : ");
            jam += aa.nextInt();
            System.out.print("Menit : ");
            menit += aa.nextInt();
            System.out.print("Detik : ");
            detik += aa.nextInt();
        }
        menit += detik / 60; 
        detik = detik % 60;
        jam += menit / 60;
        menit = menit % 60;

        System.out.println("Total : " + jam + " jam " + menit + " menit " + detik + " detik");
        if (jam > 24) {
            System.out.println("Seppuh");
        } else if (jam >= 8) {
            System.out.println("Abang Jago");
        } else {
            System.out.println("Kapan Jagonya?");
        }
    }
}

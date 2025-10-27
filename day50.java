package pkg100dayscoding2025;

import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = aa.nextInt();
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}

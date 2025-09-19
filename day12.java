package pkg100dayscoding2025;

import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = input.next();
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();
        System.out.print("Masukkan Alamat : ");
        String alamat = input.next();
        System.out.print("Masukkan No Handphone : ");
        String no = input.next();
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("No HP : " + no);
        
    }
}

package pkg100dayscoding2025;

import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap : ");
        String nama = aa.nextLine();
        System.out.print("Masukkan Kode Negara (JP/KR/US/IND/SG) : ");
        String kn = aa.nextLine();
        System.out.print("Masukkan Kode Tambahan (boleh kosong) : ");
        String cttn = aa.nextLine();
        if (nama.isBlank()) {
            System.err.println("Error: Nama tidak boleh kosong!");
            return;
        }
        nama = nama.trim();
        if (nama.length() <= 5) {
            System.out.println("Error: Nama harus lebih dari 5 karakter!");
            return;
        }
        String[] kata = nama.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (String k : kata) {
            if (!k.isBlank()) {
                sb.append(Character.toUpperCase(k.charAt(0)))
                  .append(k.substring(1))
                  .append(" ");
            }
        }

        nama = sb.toString().trim();
        String kodeUpper = kn.toUpperCase();

        String[] daftarKode = {"JP", "KR", "US", "IND", "SG"};

        boolean validKode = false;

        for (String kd : daftarKode) {
            if (kodeUpper.equals(kd)) {
                validKode = true;
                break;
            }
        }
        if (!validKode) {
            System.err.println("Error: Kode negara tidak didukung!");
            return;
        }
        boolean urgent = false;

        if (cttn.isBlank()) {
            cttn = "Tidak ada catatan.";
        } else {
            if (cttn.toLowerCase().contains("urgent")) {
                urgent = true;
            }
            cttn = cttn.toLowerCase();
            cttn = cttn.replace("hotel", "akomodasi");
        }
        System.out.println("=== HASIL PEMRORESAN DATA ===");
        System.out.println("Nama : " + nama);
        System.out.println("Tujuan : " + kodeUpper);
        System.out.println("Catatan : " + (urgent ? "Catatan bersifat URGENT" : "Catatan Tidak urgent"));
        System.out.println("Detail  : " + cttn);
        System.out.println("Panjang Nama   : " + nama.length() + " karakter");


    }
}

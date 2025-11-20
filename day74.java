package pkg100dayscoding2025;

import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalBelanja = 0;
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n===== MENU WARUNG =====");
            System.out.println("1. Nasi Goreng - 15000");
            System.out.println("2. Ayam Geprek - 17000");
            System.out.println("3. Es Teh - 5000");
            System.out.println("4. Es Jeruk - 6000");

            System.out.print("\nPilih menu (1-4): ");
            int pilih = in.nextInt();

            int harga = 0;
            String namaMenu = "";

            switch (pilih) {
                case 1:
                    namaMenu = "Nasi Goreng";
                    harga = 15000;
                    break;
                case 2:
                    namaMenu = "Ayam Geprek";
                    harga = 17000;
                    break;
                case 3:
                    namaMenu = "Es Teh";
                    harga = 5000;
                    break;
                case 4:
                    namaMenu = "Es Jeruk";
                    harga = 6000;
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    continue;
            }

            System.out.print("Jumlah: ");
            int jumlah = in.nextInt();

            int subtotal = harga * jumlah;
            totalBelanja += subtotal;

            System.out.println(namaMenu + " x" + jumlah + " = Rp " + subtotal);

            System.out.println("\n1. Pesan menu lain");
            System.out.println("2. Lanjut ke pembayaran");
            System.out.print("Pilih: ");
            int pilihLanjut = in.nextInt();

            switch (pilihLanjut) {
                case 1:
                    continue;

                case 2:
                    System.out.println("\n===== TOTAL PEMBAYARAN =====");
                    System.out.println("TOTAL BELANJA: Rp " + totalBelanja);

                    System.out.println("\n1. Pesan lagi");
                    System.out.println("2. Selesai");
                    System.out.print("Pilih: ");
                    int akhir = in.nextInt();

                    switch (akhir) {
                        case 1:
                            totalBelanja = 0; // reset total
                            break;
                        case 2:
                            System.out.println("Terima kasih sudah berbelanja!");
                            jalan = false;
                            break;
                        default:
                            jalan = false;
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        in.close();
    }
}

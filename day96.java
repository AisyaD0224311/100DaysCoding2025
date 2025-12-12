package pkg100dayscoding2025;
public class day96 {
    int tambah(int a, int b) {
        return a + b;
    }
    int kurang(int a, int b) {
        return a - b;
    }
    int kali(int a, int b) {
        return a * b;
    }
    double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        day96 tes = new day96();

        int x = 20;
        int y = 5;

        System.out.println("Penjumlahan: " + tes.tambah(x, y));
        System.out.println("Pengurangan: " + tes.kurang(x, y));
        System.out.println("Perkalian  : " + tes.kali(x, y));
        System.out.println("Pembagian  : " + tes.bagi(x, y));
    }
}

package pkg100dayscoding2025;
public class day41 {
    public static void main(String[] args) {
        Scanner aa =  new Scanner(System.in);
        int gajiLembur = 55000;
        System.out.print("Masukkan Gaji Pokok : ");
        int gaji = aa.nextInt();
        System.out.print("Masukkan jumlah jam lembur : ");
        int jam = aa.nextInt();
        int lembur = gajiLembur * jam;
        int total = lembur + gaji;
        System.out.println("Gaji bersih yang diterima : Rp" + total);
    }
}


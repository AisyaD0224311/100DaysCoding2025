package pkg100dayscoding2025;

import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7) : ");
        int a = aa.nextInt();
        switch(a){
            case 1:
                System.out.println("Hari ke-1 adalah hari senin");    
                break;
            case 2:
                System.out.println("Hari ke-2 adalah hari selasa");
                break;
            case 3:
                System.out.println("Hari ke-3 adalah hari rabu");
                break;
            case 4:
                System.out.println("Hari ke-4 adalah hari kamis");
                break;
            case 5:
                System.out.println("Hari ke-5 adalah hari jumat");
                break;
            case 6:
                System.out.println("Hari ke-6 adalah hari sabtu");
                break;
            case 7:
                System.out.println("Hari ke-7 adalah hari minggu");
                break;
            default :
                System.out.println("Tidak termasuk kategori ");
                break;
        }
    }
}

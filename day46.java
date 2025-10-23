package pkg100dayscoding2025;

import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Selamat Data di cafe Aisya\nDaftar Menu : ");
        System.out.println("1. Americano\n2. Latte\n3. Coffee Caramel\n4. Matcha Latte");
        System.out.print("Masukkan pilihan anda : ");
        int a = aa.nextInt();
        switch(a){
            case 1:
                System.out.println("Anda memesan Americano");
                
                break;
            case 2:
                System.out.println("Anda memesan Latte");
                break;
            case 3:
                System.out.println("Anda memesan Coffee Caramel");
                break;
            case 4:
                System.out.println("Anda memesan Matcha Latte");
                break;
            default :
                System.out.println("Pesanan anda tidak termasuk kategori");
                break;
        }
        System.out.println("Terimakasih telah memesan");
    }
}

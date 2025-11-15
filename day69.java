package pkg100dayscoding2025;
import java.util.Scanner;
public class day69 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan batas huruf : ");
        char b = aa.next().charAt(0);
        System.out.print("Masukkan angka yang dihilangkan : ");
        char h = aa.next().charAt(0);
        for (char i = 'A'; i <= b; i++) {
            if(i != h){
                System.out.print(i + " ");
            }
        }
    }
}


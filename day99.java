package pkg100dayscoding2025;

import java.util.Scanner;

public class day99 {

    void prima(int p) {
        for (int i = 2; i <= p; i++) {
            boolean prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if(prima){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        day99 tes = new day99();
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        tes.prima(aa.nextInt());
    }
}

package pkg100dayscoding2025;

import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = aa.nextInt();
        if(a == 0){
            System.out.println(a + " adalah nol");
        }else if(a %2 == 0){
            System.out.println(a + " adalah genap");
        }else{
            System.out.println(a + " adalah ganjil");
        }
    }
}


package pkg100dayscoding2025;

import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        int a = aa.nextInt();
        System.out.print("True or False? : ");
        boolean b = aa.nextBoolean();
        if(a >= 50 && b == true){
            if(a == 90){
                System.out.println("Hello World!");
            }else{
                System.out.println("Halo Dunia!");
            }
        }else{
            System.out.println("Aku galau");
        }
    }
}

package pkg100dayscoding2025;

import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();
        if(a == 0){
            System.out.println("Nol");
        }else if(a %2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}

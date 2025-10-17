package pkg100dayscoding2025;

import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner aa =  new Scanner(System.in);
        double a1, a2, hasil;
        char op;
        System.out.print("Masukkan angka pertama : ");
        a1 = aa.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        op = aa.next().charAt(0);
        System.out.print("Masukkan angka kedua : ");
        a2 = aa.nextDouble();
        
        if(op == '+'){
            hasil = a1 + a2;
            System.out.println("Hasil = " + hasil);
        }else if(op == '-'){
            hasil = a1 - a2;
            System.out.println("Hasil = " + hasil);
        }else if(op == '*'){
            hasil = a1 * a2;
            System.out.println("Hasil = " + hasil);
        }else if(op == '/'){
            if(a2 != 0){
                hasil = a1 / a2;
                System.out.println("Hasil = " + hasil);
            }else{
                System.err.println("Angka tidak bisa dibagi dengan nol");
            }
        }else if(op == '%'){
            hasil = a1 % a2;
            System.out.println("Hasil = " + hasil);
        }else{
            System.out.println("Inputan salah");
        }
    }
}

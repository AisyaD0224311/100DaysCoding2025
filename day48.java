package pkg100dayscoding2025;
import java.util.Scanner;
public class myClass {
  public static void main(String []args) {
    Scanner aa = new Scanner(System.in);
    double a1, a2;
    double hasil = 0;
    char op;
    System.out.print("Masukkan angka pertama : ");
    a1 = aa.nextDouble();
    System.out.print("Masukkan operator (+, -, *, /, %) : ");
    op = aa.next().charAt(0);
    System.out.print("Masukkan angka kedua : ");
    a2 = aa.nextDouble();
    
    switch(op){
        case '+':
            hasil = a1 + a2;
            break;
        case '-':
            hasil = a1 - a2;
            break;
        case '*':
            hasil = a1 * a2;
            break;
        case '/':
            if(a2 != 0){
                hasil = a1 / a2;
            }else{
                System.err.println("Angka tidak bisa dibagikan dengan nol");
            }
            break;
        case '%':
            hasil = a1 % a2;
            break;
        default:
            System.out.println("Tidak termasuk kategori");
            break;
    }
    System.out.println("Hasil = " + hasil);
  }
}

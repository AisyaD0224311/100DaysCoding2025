package pkg100dayscoding2025;
import java.util.Scanner;
public class day39{
    public static void main(String[] args) {
      Scanner aa = new Scanner(System.in);
      int makanan, minuman;
      System.out.println("Selamat datang, silahkan pesan");
      System.out.println("Daftar Menu : ");
      System.out.println("Makanan :\n1. Ayam geprek\n2. Bakso\n3. Nasi Goreng");
      System.out.println("Minuman :\n1. Es Teh\n2. Es Jeruk\n3. Es Doger");
      System.out.print("Masukkan No Makanan yang anda pilih : ");
      makanan = aa.nextInt();
      System.out.print("Masukkan No Minuman yang anda pilih : ");
      minuman = aa.nextInt();
      if(makanan == 1){
        System.out.println("Anda memesan Ayam Geprek");
      }else if(makanan == 2){
        System.out.println("Anda memesan Bakso");
      }else if(makanan == 3){
        System.out.println("Anda memesan Nasi Goreng");
      }else{
        System.out.println("Pilihan anda tidak ada di daftar menu");
      }

      if(minuman == 1){
        System.out.println("dan Anda memesan Es Teh");
        System.out.println("Terima kasih telah memesan");
      }else if(minuman == 2){
        System.out.println("dan Anda memesan Es Jeruk");
        System.out.println("Terima kasih telah memesan");
      }else if(minuman == 3){
        System.out.println("dan Anda memesan Es Doger");
        System.out.println("Terima kasih telah memesan");
      }else{
        System.out.println("Pilihan anda tidak ada di daftar menu");
        System.out.println("Sepertinya anda harus memesan ulang");
      }
    }
}

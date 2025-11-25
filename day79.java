package pkg100dayscoding2025;
import java.util.Scanner;
public class day79 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("====Membuat Akun====");
        System.out.print("Masukkan username : ");
        String username = aa.nextLine();
        System.out.print("Masukkan password : ");
        String password = aa.nextLine();
        System.out.println("Data anda telah disimpan");
        
        System.out.println("===Login===");
        for(;;){
            System.out.print("Masukkan username anda : ");
            String user = aa.nextLine();
            System.out.print("Masukkkan password anda : ");
            String pass = aa.nextLine();
            if(user.equals(username) && pass.equals(password)){
                System.out.println("===Login berhasil===");
                break;
            }else if(!user.equals(username) && pass.equals(password)){
                System.out.println("Username yang and masukkan salah, silahkan coba lagi");
            }else if(user.equals(username) && !pass.equals(password)){
                System.out.println("Password yang anda masukkan salah, silahkan coba lagi");
            }else{
                System.out.println("Username dan password yang anda masukkan salah, silahkan coba lagi");
            }
        }
    }
}

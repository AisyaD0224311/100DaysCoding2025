package pkg100dayscoding2025;

import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        String username, password;
        int percobaan = 3;
        do{
            System.out.print("Masukkan username : ");
            username = aa.nextLine();
            System.out.print("Masukkan password : ");
            password = aa.nextLine();
            if(username.equalsIgnoreCase("Aisya") && password.equalsIgnoreCase("D0224311")){
                System.out.println("Login sebagai pengguna");
                break;
            }else if(username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")){
                System.out.println("Login Sebagai Admin");
                break;
            }else{
                percobaan--;
                System.out.println("Silahkan Coba Lagi");
                System.out.println("Sisa percobaan : " + percobaan);
            }
            
        }while(percobaan > 0);
        if(percobaan == 0){
            System.out.println("Login gagal");
        }
    }
}

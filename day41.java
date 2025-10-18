package pkg100dayscoding2025;
import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner aa =  new Scanner(System.in);
        int a = aa.nextInt();
        if(a %3 == 0 && a %5 == 0){
            System.out.println("Master class");
        }else if(a %3 == 0){
            System.out.println("Pride of 3");
        }else if(a %5 == 0){
            System.out.println("Pride of 5");
        }else{
            System.out.println("Tidak termasuk kategori");
        }
    }
}




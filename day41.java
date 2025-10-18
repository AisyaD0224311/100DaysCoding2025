package pkg100dayscoding2025;
import java.util.Scanner;
public class day41 {
   public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        double a = aa.nextInt();
        double b = aa.nextInt();
        double c = aa.nextInt();
        double d = aa.nextInt();
        double ab = a / b;
        double cd = c / d;
        System.out.println(ab);
        System.out.println(cd);
        if(ab == cd){
            System.out.println("Sama");
        }else if(ab > cd){
            System.out.println("lebih besar");
        }else{
            System.out.println("Lebih kecil");
        }
    }
}





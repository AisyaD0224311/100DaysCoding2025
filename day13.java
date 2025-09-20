package pkg100dayscoding2025;

import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int c = 0;
        c = a;
        a = b;
        b = c;
        
        System.out.println(a);
        System.out.println(b);
    }
}

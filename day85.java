package pkg100dayscoding2025;

import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = aa.nextInt();
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

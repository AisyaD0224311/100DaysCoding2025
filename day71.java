package pkg100dayscoding2025;

import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int n = aa.nextInt();
        for (int i = 1; i <= n; i++) {
            char s = (i % 2 == 1) ? '*' : '#';
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print(s);
                } else {
                    System.out.print(s == '*' ? '#' : '*');
                }
            }
            System.out.println();
        }
    }
}

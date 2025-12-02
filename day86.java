package pkg100dayscoding2025;
import java.util.Scanner;
public class day86 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int a[] = new int[5];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            a[i] = aa.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}

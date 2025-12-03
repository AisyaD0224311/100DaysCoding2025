package pkg100dayscoding2025;
public class day87 {
    public static void main(String[] args) {
        int a[] = {66, 77, 88, 99, 111};
        int c = 88;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == c){
                System.out.println("Elemen " + c + " ditemukan pada indeks " + i);
            }
        }
    }
}

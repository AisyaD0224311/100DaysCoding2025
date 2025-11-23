package pkg100dayscoding2025;
public class day77 {
    public static void main(String[] args) {
        String a = "HaloJava";
        String b = "    Halo Java   ";
        System.out.println("Teks asli a : " + a);
        System.out.println("Teks asli b : " + b);
        System.out.println(a.substring(0, 3));
        System.out.println(b.replace("Halo", "Hai")); 
        System.out.println(b.trim());
    }
}

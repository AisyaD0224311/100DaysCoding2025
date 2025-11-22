package pkg100dayscoding2025;
public class day76 {
    public static void main(String[] args) {
        String a = "Halo JW";
        String b = "halo jw";

        System.out.println("Apakah " + a + " dan " + b + " sama persis ? : " + a.equals(b));
        System.out.println("Apakah " + a + " dan " + b + " sama persis tanpa melihat huruf kapital nya ? : " + a.equalsIgnoreCase(b));
        System.out.println("Apakah " + a + " mengandung kata JW ? : " + a.contains("JW"));
        System.out.println("Apakah a kosong ? : " + a.isEmpty());
        System.out.println("Apakah b kosong ? : " + b.isEmpty());
    }
}

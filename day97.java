package pkg100dayscoding2025;
public class day97 {
    int hitungLuas(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Sisi persegi = " + sisi);
        System.out.println("Luas persegi = " + luas);
        return luas;
    }

    public static void main(String[] args) {
        day97 tes = new day97();
        tes.hitungLuas(5); 
    }
}


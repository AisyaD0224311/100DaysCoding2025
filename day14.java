package pkg100dayscoding2025;
public class day14 {
    public static void main(String[] args) {
        System.out.println("Konversi String ke tipe data primitif");
        System.out.println();
        
        String ints = "18";
        String doubles = "3.41";
        String booleans = "true";
        
        int umur = Integer.parseInt(ints);
        double ip = Double.parseDouble(doubles);
        boolean syarat = Boolean.parseBoolean(booleans);
        
        System.out.println("Umur saya : " + umur);
        System.out.println("IP saya di smt 1 : " + ip);
        System.out.println("Apakah IP saya memenuhi syarat penerima KIP : " + syarat);
        System.out.println();
    }
}

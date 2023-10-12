import java.util.Scanner;

public class SistemEkspedisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, disc, jmlHalBuku;
        double total, bayar, jmlDis;
        String 
        System.out.println("Masukan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukan Besaran Gaji Anda");
        gaji = input.nextInt();
        System.out.println("Masukan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk = input.nextInt();
        System.out.println("Masukan Potongan Gaji anda ");
        potGaji = input.nextInt();
        TotGaji = (gaji * jmlMasuk) - (potGaji * JmlTdkMasuk);
        System.out.println("Gaji yang anda terima adalah " + TotGaji);

    }
}
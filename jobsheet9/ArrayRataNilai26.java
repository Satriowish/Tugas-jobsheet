import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int[] NilaiMhs = new int[10];
        double Total = 0;
        double Rata2;

        for (int i = 0; i < NilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            NilaiMhs[i] = input26.nextInt();
        }
        for (int i = 0; i < NilaiMhs.length; i++) {
            Total += NilaiMhs[i];

        }
        Rata2 = Total / NilaiMhs.length;
        System.out.println("Rata-rata Nilai = " + Rata2);

    }
}

import java.util.Scanner;

public class ArrayNilai26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        int[] nilaiakhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-" + i + " : ");
            nilaiakhir[i] = input26.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir Ke-" + i + " Adalah " + nilaiakhir[i]);

        }
    }
}

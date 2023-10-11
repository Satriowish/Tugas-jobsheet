import java.util.Scanner;

public class Pemilihan2Percobaan126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int tahun;

        System.out.print(" Masukkan Tahun  : ");
        tahun = input26.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            System.out.println(" adalah tahun kabisat.");
        } else {
            System.out.println(" bukan tahun kabisat.");
        }
    }
}

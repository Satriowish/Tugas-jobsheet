import java.util.Scanner;

public class DoWhileCuti26 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.println("Masukkan jatah cuti: ");
        jatahCuti = input10.nextInt();
        do {
            System.out.println("Apakah ingin mengambil cuti (y/n)");
            konfirmasi = input10.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Masukkan jumlah hari cuti anda: ");
                jumlahHari = input10.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti anda: " + jatahCuti);
                } else {
                    System.out.println("Jatah cuti kurang");
                }
            } else if (konfirmasi.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("jatah cuti kurang");
                System.out.println("apakah ingin mencoba lagi (y/n) ");
                if (!konfirmasi.equalsIgnoreCase("y")) {
                    break;
                }
            }
        } while (true);
    }
}

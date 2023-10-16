import java.util.Scanner;

public class WhileGaji26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int jumlahkaryawan, jumlahjamlembur;
        double gajilembur = 0, totalgajilembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jumlahkaryawan = input26.nextInt();

        int i = 0;
        while (i < jumlahkaryawan) {
            System.out.println("Pilihlah jabatan - Direktur,Manajer,Karwyawan");
            System.out.print("Masukkan jabatan Karyawan ke-" + (i + 1) + ": ");
            jabatan = input26.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahjamlembur = input26.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajilembur = jumlahjamlembur * 10000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajilembur = jumlahjamlembur * 75000;
            } else {
                System.out.println("Jabatan salah");
                i--;
                continue;
            }
            totalgajilembur += gajilembur;
            System.out.println("Total gaji lembur : Rp." + totalgajilembur);

        }

    }
}

import java.util.Scanner;

public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalsudut;

        System.out.print("Masukkan Sudut 1  : ");
        sudut1 = input26.nextInt();
        System.out.print("Masukkan Sudut 2  : ");
        sudut2 = input26.nextInt();
        System.out.print("Masukkan Sudut 3  : ");
        sudut3 = input26.nextInt();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga tersebut adalah Segitiga Siku-Siku");
            } else if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga tersebut adalah Segitiga Sama Sisi");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
                System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga tersebut adalah Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}

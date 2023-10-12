
import java.util.Scanner;

public class PemilihanTernary {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Masukan angka ");
        int angka = input26.nextInt();
        String statusAngka = (angka % 2 == 0) ? " Bilangan Genap" : " Bilangan Ganjil";

        System.out.println("Angka " + angka + " adalah" + statusAngka);
    }

}

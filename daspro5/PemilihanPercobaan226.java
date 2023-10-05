import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Nilai UAS    : ");
        float UAS = input26.nextFloat();
        System.out.println("Nilai UTS    : ");
        float UTS = input26.nextFloat();
        System.out.println("Nilai Kuis   : ");
        float Kuis = input26.nextFloat();
        System.out.println("Nilai Tugas  : ");
        float Tugas = input26.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);
        String message = total < 65 ? "Remidi " : "Tidak Remidi ";
        System.out.println("Nilai Akhir = " + total + " Sehingga " + message);

    }

}

import java.util.Scanner;

public class ForKelipatan26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int kelipatan, total, counter;

        total = 0;
        counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input26.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }

        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}
import java.util.Scanner;

public class login {
    private static String[] usernames = { "admin1" };
    private static String[] passwords = { "operator1" };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============== Silahkan login terlebih dahulu ===============");
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.print("Masukkan username     : ");
            String username = input.nextLine();

            System.out.print("Masukkan password     : ");
            String password = input.nextLine();

            isLoggedIn = login(username, password);
            if (isLoggedIn) {
                System.out.println("|===========================================================|");
                System.out.println(
                        "|          Login berhasil! Selamat datang, " + username + "!          |");
                System.out.println("|===========================================================|");
            } else {
                System.out.println("Login gagal. Coba lagi.");
            }
        }

        // jika sudah berhasil login
    }

    private static boolean login(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return true;
            }
        }
        return false;

    }

}

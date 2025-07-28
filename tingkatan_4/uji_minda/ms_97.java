// buku teks m/s 97

import java.util.Scanner;

public class ms_97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nombor yang kurang dari -10:");
        int nombor = scanner.nextInt();
        scanner.close();

        if (nombor >= -10) {
            System.out.println("nombor yang dimasukkan hendaklah kurang dari -10");
        } else {
            while (nombor < -10) {
                nombor += 1;
                System.out.println(nombor);
            }
        }
    }
}
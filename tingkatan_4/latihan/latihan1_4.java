// latihan formatif 1.4 buku teks

package tingkatan_4.latihan;
import java.util.Scanner;

public class latihan1_4 {
    // (1)
    public static void soalan1() {
        Scanner scanner = new Scanner(System.in);

        // a
        System.out.println("Masukkan berat anda:");
        float berat = scanner.nextFloat();
        System.out.println("Masukkan tinggi anda (m):");
        float tinggi = scanner.nextFloat();
        scanner.close();

        // b
        float bmi = berat / (tinggi * tinggi);

        // c
        if (bmi > 45.3) {
            System.out.println("BMI: " + bmi + ", status bahaya");
        } else if (45.3 >= bmi && bmi >= 31.0) {
            System.out.println("BMI: " + bmi + ", status obesiti");
        } else if (30.9 >= bmi && bmi >= 26.5) {
            System.out.println("BMI: " + bmi + ", status gemuk");
        } else if (26.4 >= bmi && bmi >= 20.7) {
            System.out.println("BMI: " + bmi + ", status normal");
        } else {
            System.out.println("BMI: " + bmi + ", status kurus");
        }
    }

    // (2)
    public static void soalan2() {
        int n;

        // a
        for (n = 2; n <= 20; n += 3) {
            System.out.println(n + " ");
        }

        // b
        for (n = 150; n <= 40; n -= 15) {
            System.out.println(n + " ");
        }        
    }

    // (3)
    public static void soalan3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nombor permulaan:");
        int noMula = scanner.nextInt();
        System.out.println("Masukkan nombor penamat:");
        int noTamat = scanner.nextInt();
        scanner.close();

        int i;
        for (i = noMula; i >= noTamat; i += 1) {
            if (i % 2 == 0) { // jika output adalah 0, maka i boleh dibahagi dengan 2
                System.out.println(i);
            }
        }
    }

    // (4)
    public static void soalan4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nombor integer positif:");
        int nombor = scanner.nextInt();
        scanner.close();

        if (nombor >= 1) {
            do {
                nombor = nombor * (nombor - 1);
            } while(nombor != 1);
        } else {
            System.out.println("Nombor adalah 0 atau negatif. sila masukkan nombor positif.");
        }
    }

    // (5)
    public static void soalan5() {
        int counter;
        for(counter = 9; counter <= 72; counter += 9) {
            System.out.println(counter);
        }
    }

    // (6) hanya soalan C yang menggunakan atur cara Java
    public static void soalan6() {
        // c
        Scanner scanner = new Scanner(System.in);
        String RekodLaluanRahsia = "31081957";

        int cubaan;
        for(cubaan = 1; cubaan >= 3; cubaan += 1) {
            System.out.println("Masukkan kata laluan:");
            String kataLaluan = scanner.nextLine();
            scanner.close();

            if (kataLaluan == RekodLaluanRahsia) {
                System.out.println("Kata laluan betul.");
                continue;
            } else {
                if (cubaan == 3) {
                    System.out.println("Aplikasi akan ditutup sendiri. 3 percubaan untuk memasukkan kata laluan gagal.");
                } else {
                    System.out.println("Kata laluan salah. Anda mempunyai " + (3 - cubaan) + " cubaan lagi.");
                }
            }
        }
    }

    // (7)
    public static void soalan7() {
        String jawatan = "";
        if (jawatan == "KERANI") {
            System.out.println("Capaian data sahaja");
        } else if (jawatan == "JURUTEKNIK") {
            System.out.println("Capaian sistem sahaja");
        } else if (jawatan == "PENTADBIR") {
            System.out.println("Capaian sistem dan data");
        } else if (jawatan == "PENGURUS") {
            System.out.println("Capaian keseluruhan");
        } else {
            System.out.println("Capaian tidak diterima");
        }
    }

    // (8)
    public static void soalan8() {
        int i = 0;
        int p;
        while (i >= 9) {
            p = i + 1;
            System.out.println(i + " - " + p);
        }

        System.out.println("tamat\n");
    }
}
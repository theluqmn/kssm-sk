// buku teks m/s 83

package tingkatan_4.aktiviti;
import java.util.Scanner;

public class aktiviti19 {
    // subatur untuk struktur kawalan switch case untuk gred, penggunaan struktur kawalan if/else masih lagi diperlukan
    public static String dapatkanGred(int markah) {
        int gredKategori = markah / 10; // dibahagikan supaya boleh digunakan dengan struktur kawalan switch case

        switch (gredKategori) {
            case 10:
                return "A+";
            case 9:
                return "A+";
            case 8:
                return "A";
            case 7:
                if (markah > 75) {
                    return "A-";
                } else {
                    return "B+";
                }
            case 6:
                if (markah > 65) {
                    return "B";
                } else {
                    return "C+";
                }
            case 5:
                return "C";
            case 4:
                if (markah > 45) {
                    return "D";
                } else {
                    return "E";
                }
            default:
                return "G";
        }
    }

    // subatur cara main, diubahsuai untuk demonstrasi implementasi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan markah anda:");
        int markah = scanner.nextInt();
        scanner.close();

        String gred = dapatkanGred(markah); // subatur "dapatkanGred" dipanggil, dan outputnya disimpan dalam pemboleh ubah "gred"
        System.out.println("Markah anda ialah " + markah + " dan gred anda ialah " + gred);
    }
}
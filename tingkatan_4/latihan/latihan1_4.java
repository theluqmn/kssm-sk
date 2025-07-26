// latihan formatif 1.4

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

    public static void main(String[] args) {
        soalan1();
    }
}

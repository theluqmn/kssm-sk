// buku teks m/s 93

package tingkatan_4.uji_minda;

public class ms93 {
    // (A)
    public static void soalanA() {
        int jumlah = 0;
        int i;
        for(i = 50; i <= 60; i += 1) {
            jumlah += i;
        }

        System.out.println(jumlah);
    }

    // (B)
    public static void soalanB() {
        int i;
        for(i = -10; i <= 20; i+= 1) {
            if (i % 2 == 0) { // jika output adalah 0, maka i boleh dibahagi dengan 2
                System.out.println(i);
            }
        }
    }

    // subatur cara main, untuk implementasi A dan B
    public static void main(String[] args) {
        soalanA();
        soalanB();
    }
}

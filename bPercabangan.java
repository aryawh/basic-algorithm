import java.util.Scanner;

public class bPercabangan {
    public static void main(String[] args) {
        /*
         * 1. Membuat program untuk menentukan wujud air yang berada pada suhu tertentu.
         * Adapun ketentuan-ketentuannya adalah sebagai berikut.
         * suhu ≤0 air akan berwujud padat (es)
         * 0 < suhu < 100 air akan berwujud cair
         * suhu ≥100 air akan berwujud gas
         * Program akan memilki output sebagai berikut :
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan input suhu dalam celcius : ");
        int inputSuhu = scanner.nextInt();

        if (inputSuhu <= 0) {
            System.out.println("Pada suhu " + inputSuhu + " air akan berwujud padat(es)");
        } else if (inputSuhu < 100) {
            System.out.println("Pada suhu " + inputSuhu + " air akan berwujud cair");
        } else {
            System.out.println("Pada suhu " + inputSuhu + " air akan berwujud gas");
        }

        /*
         * 2. Membuat program dengan menggunakan statement SWITCH untuk menampilkan
         * menu-menu perhitungan aritmatika, dengan output sebagai berikut
         */

        System.out.println("<<<<< MENU <<<<<<<");
        System.out.println("1. Menghitung Isi Kubus");
        System.out.println("2. Menghitung Luas Lingkaran");
        System.out.println("3. Menghitung Isi Silinder");
        System.out.print("Pilih (1-3) : ");
        int inputMenu = scanner.nextInt();

        switch (inputMenu) {
            case 1:
                System.out.println("Panjang sisi kubus : ");
                int sisiKubus = scanner.nextInt();
                int rumusVolumeKubus = sisiKubus * sisiKubus * sisiKubus;
                System.out.println("Isi Kubus = " + rumusVolumeKubus);
                break;
            case 2:
                System.out.println("Jari-jari lingkaran : ");
                int jariJari = scanner.nextInt();
                double rumusLuasLingkaran = 3.14 * jariJari * jariJari;
                System.out.println("Luas Lingkaran = " + rumusLuasLingkaran);
                break;

            case 3:
                System.out.println("Jari-jari Silinder : ");
                int jariJariSilinder = scanner.nextInt();
                System.out.println("Tinggi Silinder : ");
                int tinggiSilinder = scanner.nextInt();
                double rumusIsiSilinder = 3.14 * jariJariSilinder * jariJariSilinder * tinggiSilinder;
                System.out.println("Isi Lingkaran = " + rumusIsiSilinder);
                break;
            default:
                break;
        }

        /*
         * 3. Buatlah sebuah program dengan struktur If satu kondisi, dimana dapat
         * menentukan
         * apakah sebuah Huruf yang dimasukan user termasuk Huruf Vokal atau Konsonan.
         * Dengan tampilan output sebagai berikut
         */

        System.out.print("Masukkan Sebuah huruf :");
        char huruf = scanner.next().charAt(0);
        char[] vokal = { 'A', 'I', 'U', 'E', 'O' };

        huruf = Character.toUpperCase(huruf);

        boolean isVokal = false;

        for (char v : vokal) {
            if (v == huruf) {
                isVokal = true;
                break;
            }
        }

        if (isVokal) {
            System.out.println(huruf + " Adalah salah satu huruf vokal");
        } else {
            System.out.println(huruf + " Adalah huruf konsonan");
        }

        /*
         * Buatlah sebuah program dengan struktur If dua kondisi, dimana dapat melakukan
         * validasi nilai pada proses pembagian bilangan. Dengan tampilan output sebagai
         * berikut :
         */
        System.out.println("PROGRAM PEMBAGIAN");
        System.out.print("Masukkan bilangan yang akan dibagi : ");
        int pembilang = scanner.nextInt();
        System.out.print("Masukkan bilangan pembagi : ");
        int pembagi = scanner.nextInt();

        float hasil = pembilang / pembagi;
        if (pembagi == 0) {
            System.out.println("Tidak boleh '0'");
        } else {
            System.out.println("Hasilnya adalah : " + hasil);
        }

        scanner.close();
    }

}

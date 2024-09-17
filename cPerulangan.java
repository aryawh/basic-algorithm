import java.util.Scanner;

class fibbonaci {

    public static void hello() {
        System.out.println("Hello world");
    }

    // Membuat fibbonaci, contoh input '5', 5+4+3+2+1 = 15
    public static void result() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai yang diinginkan : ");
        Integer inputan = scanner.nextInt();
        Integer jumlah = 1;

        System.out.print(inputan + " = ");
        while (inputan > 1) {
            jumlah += inputan;
            if (inputan != 1) {
                System.out.print(inputan + " + ");
            } else {
                System.out.print(inputan + " = ");
            }
            inputan--;
        }
        System.out.print(jumlah);
        scanner.close();
    }
}

class perpangkatan {
    public static void result() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int bilangan = scanner.nextInt();
        System.out.print("Masukkan pencacah : ");
        int pencacah = scanner.nextInt();
        int hasil = 1;

        for (int i = 1; i <= pencacah; i++) {
            hasil *= bilangan;
        }
        System.out.println("Hasilnya : " + hasil);
        scanner.close();
    }
}

public class cPerulangan {

    fibbonaci f = new fibbonaci();
    static perpangkatan perpangkatan = new perpangkatan();

    public static void main(String[] args) {
        // fibbonaci.result();
        perpangkatan.result();
    }
}

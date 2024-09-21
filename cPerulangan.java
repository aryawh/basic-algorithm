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

// 1. LOOPING UP AND DOWN
class loopingUpAndDown {
    static void result() {
        System.out.println("PERULANGAN MENAIK");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("PERULANGAN MENURUN");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

// 2. LOOPING BERSARANG
class loopingBersarang {
    void result() {
        int j = 10;
        int k;
        int result;
        while (j >= 1) {
            k = 1;
            while (k <= j) {
                result = k * j;
                System.out.print(result + " ");
                k++;
            }
            System.out.println();
            j--;
        }
    }
}

// 3. FAKTORIAL
class realFaktorial {
    static void result() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan bilangan yang akan dihitung : ");
        int value = scanner.nextInt();
        int temp = 1;

        System.out.print(value + "! = ");
        while (value >= 1) {
            temp *= value;
            if (value != 1) {
                System.out.print(value + " x ");
            } else {
                System.out.print(value + " = ");

            }
            value--;
        }
        System.out.println(temp);
        scanner.close();
    }
}

public class cPerulangan {

    fibbonaci f = new fibbonaci();
    static perpangkatan perpangkatan = new perpangkatan();
    loopingUpAndDown loop = new loopingUpAndDown();
    static loopingBersarang loopingBersarang = new loopingBersarang();
    realFaktorial real = new realFaktorial();

    public static void main(String[] args) {
        // fibbonaci.result();
        // perpangkatan.result();
        // loopingUpAndDown.result();
        // loopingBersarang.result();
        realFaktorial.result();
    }
}

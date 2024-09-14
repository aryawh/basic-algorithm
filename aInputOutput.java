import java.util.Scanner;

public class aInputOutput {

    // 1. Buatlah program yang meminta input berupa angka, karakter, dan kata.
    // Selanjutnya program
    // akan menampilkan data-data tersebut

    // 2. Modifikasi program pada nomor 1 sehingga program mengoutputkan bilangan
    // basis 16
    // (hex) dari angka yang diinputkan!

    // 3. Pak Adi membuat program yang dapat menerima input dari user sembarang
    // bilangan
    // desimal, kemudian mencetak kembali dengan ketentuan hanya ada 2 angka di
    // belakang
    // koma. Bantulah Pak Adi dalam membuat program tersebut
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input berupa Angka : ");
        Integer angka = scanner.nextInt();
        System.out.println("Outputnya adalah " + angka);

        System.out.print("Input berupa Karakter : ");
        char karakter = scanner.next().charAt(0);
        System.out.println("Outputnya adalah " + karakter);

        // Membersihkan newline yang tertinggal dari input karakter sebelumnya
        scanner.nextLine();

        System.out.print("Input berupa Kata : ");
        String kata = scanner.nextLine();
        System.out.println("Outputnya adalah " + kata);

        // Basis 16
        String hex = Integer.toString(angka, 16);
        System.out.println("Bilangan basis 16 = " + hex);

        // Program pak adi
        System.out.print("Silahkan input sembarang pak adi : ");
        double desimal = scanner.nextDouble();
        System.out.printf("Bilangan desimal hanya 2 angka di belakang koma: %.2f\n", desimal);

        scanner.close();

    }
}

import java.util.Scanner;

public class MainPangkat19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat19[] png = new Pangkat19[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat19(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat19 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF19(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat19 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC19(p.nilai, p.pangkat));
        }
    }
}

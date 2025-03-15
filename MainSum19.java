import java.util.Scanner;

public class MainSum19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum19 sm = new Sum19(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF19());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC19(sm.keuntungan, 0, elemen - 1));
    }
}

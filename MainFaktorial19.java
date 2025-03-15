import java.util.Scanner; 
public class MainFaktorial19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial19 fk = new Faktorial19();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF19(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC19(nilai));
    }
}
// Main.java
public class MainMahasiswa19 {
    public static void main(String[] args) {
        // Data tabel mahasiswa
        Mahasiswa19[] mahasiswa = {
            new Mahasiswa19("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa19("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa19("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa19("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa19("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa19("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa19("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa19("Hadi", "220101008", 2020, 82, 84),
        };

        // Menampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa19 mhs : mahasiswa) {
            mhs.tampilkanData();
        }

        // Panggil method dari kelas Mahasiswa mencari hasil yang diinginkan
        int maxUTS = Mahasiswa19.cariMaxUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("\nNilai UTS Tertinggi: " + maxUTS);

        int minUTS = Mahasiswa19.cariMinUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nilai UTS Terendah: " + minUTS);

        double rataRataUAS = Mahasiswa19.hitungRataRataUAS(mahasiswa);
        System.out.println("Rata-rata Nilai UAS: " + rataRataUAS);
    }
}

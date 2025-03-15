public class Mahasiswa19 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    // Konstruktor
    public Mahasiswa19(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method menampilkan data mahasiswa dengan format tabel
    public void tampilkanData() {
        System.out.printf("%-15s | %-10s | %-10d | UTS: %-3d | UAS: %-3d\n", nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);
    }

    // Method Divide and Conquer mencari nilai UTS tertinggi
    public static int cariMaxUTS(Mahasiswa19[] data, int left, int right) {
        if (left == right) {
            return data[left].nilaiUTS;
        }

        int mid = (left + right) / 2;
        int maxKiri = cariMaxUTS(data, left, mid);
        int maxKanan = cariMaxUTS(data, mid + 1, right);

        return Math.max(maxKiri, maxKanan);
    }

    // Method Divide and Conquer mencari nilai UTS terendah
    public static int cariMinUTS(Mahasiswa19[] data, int left, int right) {
        if (left == right) {
            return data[left].nilaiUTS;
        }

        int mid = (left + right) / 2;
        int minKiri = cariMinUTS(data, left, mid);
        int minKanan = cariMinUTS(data, mid + 1, right);
        return Math.min(minKiri, minKanan);
    }

    // Method Brute Force menghitung rata-rata nilai UAS
    public static double hitungRataRataUAS(Mahasiswa19[] data) {
        int total = 0;
        for (Mahasiswa19 mhs : data) {
            total += mhs.nilaiUAS;
        }
        return (double) total / data.length;
    }

    // Method untuk menampilkan header tabel
    public static void tampilkanHeader() {
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-15s | %-10s | %-10s | %-6s | %-6s\n", "Nama", "NIM", "Tahun Masuk", "UTS", "UAS");
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        Mahasiswa19[] mahasiswa = {
            new Mahasiswa19("Andi", "12345", 2020, 80, 85),
            new Mahasiswa19("Budi", "12346", 2021, 75, 90),
            new Mahasiswa19("Citra", "12347", 2019, 85, 80),
            new Mahasiswa19("Dewi", "12348", 2022, 70, 75)
        };

        // Menampilkan data mahasiswa dalam format tabel
        tampilkanHeader();
        for (Mahasiswa19 mhs : mahasiswa) {
            mhs.tampilkanData();
        }
        System.out.println("-----------------------------------------------------------");

        // Menampilkan hasil pencarian nilai tertinggi, terendah, dan rata-rata
        System.out.println("Nilai UTS Tertinggi: " + cariMaxUTS(mahasiswa, 0, mahasiswa.length - 1));
        System.out.println("Nilai UTS Terendah: " + cariMinUTS(mahasiswa, 0, mahasiswa.length - 1));
        System.out.printf("Rata-rata Nilai UAS: %.2f\n", hitungRataRataUAS(mahasiswa));
    }
}

// Mahasiswa.java
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

    // Method menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println(nama + " | " + nim + " | " + tahunMasuk + " | UTS: " + nilaiUTS + " | UAS: " + nilaiUAS);
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
}

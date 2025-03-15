public class Pangkat19 {

    int nilai, pangkat;

    Pangkat19(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    int pangkatBF19(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    int pangkatDC19(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        } else {
            if (n % 2 == 0) {
                int half = pangkatDC19(a, n / 2);
                return half * half;
            } else {
                return a * pangkatDC19(a, n - 1);
            }
        }
    }
}

public class Sum19 {

    double keuntungan[];

    Sum19(int el) {
        keuntungan = new double[el];
    }

    double totalBF19() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC19(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        double lsum = totalDC19(arr, l, mid);
        double rsum = totalDC19(arr, mid + 1, r);
        return lsum + rsum;
    }
}

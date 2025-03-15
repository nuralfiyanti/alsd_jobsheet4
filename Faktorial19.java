public class Faktorial19 {

       // method faktorialBF():
       int faktorialBF19(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    // method faktorialDC():
    int faktorialDC19(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC19(n - 1);
            return fakto;
        }
    }
}

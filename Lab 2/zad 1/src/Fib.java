public class Fib {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iteracyjnie: ");
        for (int i = 0; i <= n; ++i) {
            System.out.print(fibbI(i) + " ");
        }
        System.out.println("\n" + "Rekurencyjnie: ");
        for (int i = 0; i <= n; ++i){
            System.out.print(fibbR(i) + " ");
        }
    }
    public static int fibbI(int n){
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 0;
        for (int i = 0; i < n; ++i){
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib1;
    }
    public static int fibbR(int n){
        int fib2;
        if (n <= 1) {
            return n;
        }
        return fibbR(n - 1) + fibbR(n - 2);
    }
}

public class Printer {
    public static void main(String[] args) {
        print_even(6);
        System.out.println("##############");
        print_evenbit(8);
    }
    public static void print_even(int N){
        for (int i = 0; i <= N; ++i){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void print_evenbit(int N){
        int x = 1;
        for (int i = 0; i <= N; ++i){
            if ((i & x) == 0){
                System.out.println(i);
            }
        }
    }
}
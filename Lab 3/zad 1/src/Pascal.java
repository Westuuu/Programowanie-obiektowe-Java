public class Pascal {
    public static void PascalList(int N){
        int max = 0;

        int[][] pascal = new int[N + 1][];
        pascal[1] = new int[3];
        pascal[1][1] = 1;
        for (int i = 2; i <= N; ++i){
            pascal[i] = new int[i + 2];
            for (int j = 1; j < pascal.length - 1; ++j){
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                String liczba = Integer.toString(pascal[i][j]);
                int dlugosc = liczba.length();
                if (dlugosc > max){
                    max = dlugosc;
                }
            }
        }
        for (int i = 1; i <= N; ++i) {
            for (int j = N; j > i; --j){
                for (int k = 0; k < max; ++k){
                    System.out.print(" ");
                }
            }
            for (int j = 1; j < pascal[i].length - 1; ++j){
                for (int k = 0; k < max; ++k){
                    System.out.print(" ");
                }
            }
        }
    }
}


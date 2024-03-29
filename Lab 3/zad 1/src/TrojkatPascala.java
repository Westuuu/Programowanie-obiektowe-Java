public class TrojkatPascala {
    public static void main(String[] args) {
    PascalLista(20);
    }
    public static void PascalLista(int rzad){
        int max = 0;

        int[][] pascal = new int[rzad + 1][];
        pascal[1] = new int[3];
        pascal[1][1] = 1;
        for (int i = 2; i <= rzad; ++i){
            pascal[i] = new int[i + 2];
            for (int j = 1; j < pascal[i].length - 1; ++j){
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                String liczba = Integer.toString(pascal[i][j]);
                int dlugosc = liczba.length();
                if (dlugosc > max){
                    max = dlugosc;
                }
            }
        }
        for (int i = 1; i <= rzad; ++i) {
            for (int j = rzad; j > i; --j){
                System.out.printf("%" + max + "s", " ");
            }
            for (int j = 1; j < pascal[i].length - 1; ++j){
                System.out.printf("%" + max*2 + "s", pascal[i][j]);
            }
            System.out.println();
        }
    }
}
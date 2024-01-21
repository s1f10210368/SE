public class Combination {
    public static int combination(int n, int r) {
        int result = 1;
        for(int i = 0; i < r; i++) {
            result *= (n - i);
        }
        for(int i = 0; i < r; i++) {
            result /= (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int r = 3;
        int c = combination(n, r);
        System.out.printf("C(%d, %d) = %d\n", n, r, c);
    }    
}

public class Fact {
    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int f = fact(n);
        System.out.printf("fact(%d) = %d\n", n, f);
    }
}

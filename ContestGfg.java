public class ContestGfg  {
    public static long maxProduct(int n) {
        int a = n / 2;
        int b = n - a; // Ensure a + b = n
        return (long) a * b;
    }
}
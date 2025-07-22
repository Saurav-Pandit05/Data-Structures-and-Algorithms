// Print x to the power n

public class Prblm9 {
    public static int power (int x, int n){
        // Base Case
        if (n == 0){
            return 1;
        }
        int xmn1 = power(x, n-1);
        int xn = x * xmn1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}

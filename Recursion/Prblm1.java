// Print Numbers from n to 1 (Decresing Oder)

public class Prblm1 {
    public static void PrintDec(int n) {
        // Base Case
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        PrintDec(n);
    }
}

// Print Numbers from 1 to n (Increasing Order)

public class Problem2 {
    public static void PrintInc(int n) {
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 20;
        PrintInc(n);
    }
}

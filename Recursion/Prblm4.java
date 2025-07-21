// Print Sum of N Natural Numbers

public class Prblm4 {
    public static int CalculSum(int n) {
        //Base Case
        if(n == 1){
            return 1;
        }
        int snm1 = CalculSum(n-1);
        int sn = n + snm1; 
        return sn;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(CalculSum(n));
    }
}

// Inverted & Rotated Half - Pyramid

public class Patt7 {
    public static void inverted_rotated_half_pyramid(int n) {
        //Inner Loop
        for(int i=1; i<=n; i++){
            // For Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" " + " ");
            }
            //For Stars
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }

            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
    }
}

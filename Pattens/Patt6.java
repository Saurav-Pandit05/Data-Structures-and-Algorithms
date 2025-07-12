// Print Hollow-Rectangle Patterns

public class Patt6 {
    public static void hollow_rectangle(int Row, int Col) {
        // Outer Loop
        for(int i=1; i<=Row; i++){
            //Inner Loop
            for(int j=1; j<=Col; j++){
                // Boundary Condition
                if(i==1 || i==Row || j==1 || j==Col){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(8, 10);
    }
}

// Check if array is sorted or not 

public class Prblm6 {
    public static boolean isSorted(int[] arr , int i) {
        // Base Case
        if (i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(isSorted(arr, 0));
    }
}

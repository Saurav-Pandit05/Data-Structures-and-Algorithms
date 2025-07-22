// WAF to find the first occurence of an element in the array

public class Prblm7 {
    public static int firstOccurence(int[] arr, int key, int i) {
        // Base Case 
        if (i == arr.length-1){
            return  -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,17,25,65,17,100};
        System.out.println(firstOccurence(arr, 17, 0));
    }
}

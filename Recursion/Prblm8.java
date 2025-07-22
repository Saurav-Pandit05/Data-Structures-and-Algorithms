// WAF to find the last occurence of an element in the array

public class Prblm8 {
    public static int lastOccurence(int[] arr, int key, int i) {
        // Base Case
        if (i == arr.length-1){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);

        if (isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }

        // if (isFound == -1) && arr[i] == key){
        //     return i;
        // }

        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,17,25,65,17,100};
        System.out.println(lastOccurence(arr, 17, 0));
    }
}

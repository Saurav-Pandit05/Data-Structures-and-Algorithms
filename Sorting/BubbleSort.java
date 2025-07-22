public class BubbleSort {
    static void bubblesort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {14,65,874,214,268,2014,84567};
        bubblesort(arr);

        // Print Output Array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

public class SelectionSort {
    static void selectionsort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int minElement = i; 
            for(int j = i+1; j<arr.length; j++){
                if(arr[minElement] > arr[j]){
                    minElement = j;
                }
            }
            //Swap
            int temp = arr[minElement]; 
            arr[minElement] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {45,50,15,27,20};
        selectionsort(arr);

        //Print Outout array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

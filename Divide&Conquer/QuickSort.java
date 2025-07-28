public class QuickSort {
    public static void quicksort(int[] arr, int si, int ei) {
        // Base Case
        if(si >= ei){
            return;
        }

        //pivot = last element

        //Partition Part
        int pIdx = partition(arr, si, ei);

        //Calling quicksort function
        quicksort(arr, si, pIdx-1);  // left
        quicksort(arr, pIdx+1, ei);  // right
    }

    public static int partition(int[] arr, int si, int ei) {

        int pivot = arr[ei];
        int i = si-1;     // to make place for elements smaller than pivots

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //for changing pivot's position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    //print array
    public static void printarr(int[] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
    }
}

public class InserctionSort {
    static void inserctionsort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;
            //finding out the correct position to insert
            while(previous >=0 && arr[previous] > current){
                arr[previous + 1] = arr[previous];
                previous--;
            }
            //Inserction
            arr[previous+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,8,3,7,2};
        inserctionsort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }   
}

public class CountingSort {
    static void countingsort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        
        //Sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,3,6,7,1,4,2,5,6,9};
        countingsort(arr);
        
        //Print Output Array
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

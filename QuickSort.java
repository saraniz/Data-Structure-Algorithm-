public class QuickSort {

    //quick sort = moves smaller elements to left of a pivot
    //             recursively divide array in 2 partitions

    //run time complexity = best case O(n log(n))
    //                      average case O(n log(n))
    //                      worst case O(n^2) if already sorted

    //space complexity = O(log(n)) due to recursion

    public static void main(String[] args) {
        
        int[] array = {8,2,5,3,9,7,6,1};

        quickSort(array,0,array.length-1);

        for(int i: array){
            System.out.print(i+ " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end <= start){
            return;
        }

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }

    private static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start - 1;

        for(int j =start;j<=end-1;j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}

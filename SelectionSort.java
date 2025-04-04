public class SelectionSort {
    
    //selection sort search through an array and keep track of the minimum value during each iteration
    //At the end of each iteration, we swap variables

    //quadratc time O(n^2)
    //small data set = okay
    //large data set =BAD

    public static void main(String[] args) {
        
        int[] array = {8,7,9,2,3,1,5,4,6};

        selectionSort(array);

        for(int i:array){
            System.err.print(i);
        }
    }

    public static void selectionSort(int[] array){

        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i;j<array.length;j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min]=temp;
        }
    }
}

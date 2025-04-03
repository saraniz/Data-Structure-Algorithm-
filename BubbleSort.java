public class BubbleSort {

    //bubble sort pairs of adjacent elements are compared, and the elements swapped if they are not in order
    //quadratic time O(n^2) 
    //small data set = okay-ish
    //large data set = bad

    public static void main(String[] args) {
        
        int[] array = {9,8,1,7,2,6,3,4,5};

        bubleSort(array);

        for(int i: array){
            System.out.print(i);
        }
    }

    public static void bubleSort(int array[]){

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length -i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array [j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
}

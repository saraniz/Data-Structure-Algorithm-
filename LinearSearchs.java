public class LinearSearchs {

    //linear search iterate through a collection one element at a time
    //runtime complexity(O(n))

    //disadvantages
    //  slow for large data sets

    //advantages
    //fast for searches of small to medium data sets
    //soes not need sorted
    //useful for data structures that do not have random access (Linked list)

    public static void main(String[] args) {
        
         int[] array = {9,10,1,5,6};

         int index = linearSearch(array,20);

         if( index != -1){
            System.out.println("Value found in index:" + index);
         } else{
            System.out.println("Item not found");
         }
    }

    private static int linearSearch(int[] array,int value){

        for(int i=0;i<array.length;i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;

     }
}

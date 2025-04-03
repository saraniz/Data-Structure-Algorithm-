import java.util.ArrayList;

public class MainArray {

    public static class InnerMainArray {
    
         int size;
         int capacity = 10;
         Object[] array;

         public InnerMainArray(){
            this.array =  new Object[capacity];
         }

         public InnerMainArray(int capacity){
            this.capacity = capacity;
            this.array = new Object[capacity];
         }

         public void add(Object data){

            if(size>= capacity){
                grow();
            }
            array[size] = data;
            size++;

         }

         public void insert(int index, Object data){

            if(size>= capacity){
                grow();
            }
            for(int i = size;i>index;i--){
                array[i] = array[i-1];
            }
            array[index] =data;
            size++;
         }

         public void delete(Object data){

         }

         public int search(Object data){
            return -1;
         }

         public void grow(){

         }

         public void shrink(){

         }

         public boolean isEmpty(){
            return size == 0;
         }

         public String toString(){
            String string ="";

            for(int i=0; i< size; i++){
                string += array[i] + ",";
            }

            if(string != ""){
                string = "["+string.substring(0,string.length() - 2)+"]";
            }
            else{
                string = "[]";
            }

            return string;
         }


    }

    public static void main(String[] args) {

        InnerMainArray dynamicArray = new InnerMainArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");

        System.out.println(dynamicArray);

        

    }
    
}


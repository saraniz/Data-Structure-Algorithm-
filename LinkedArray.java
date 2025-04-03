import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedArray {

    public static void main(String[] args) {
        
        LinkedList<Integer> linkedLists = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i=0; i<1000000;i++){
            linkedLists.add(i);
            arrayList.add(i);
        }

        //Linked List

        startTime = System.nanoTime();

        // linkedLists.get(999999);
        linkedLists.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime ;

        System.out.println("LinkedList:\t" + elapsedTime + "ns");


        //arrayLits

        startTime = System.nanoTime();

        // arrayList.get(999999);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime ;

        System.out.println("ArrayList:\t" + elapsedTime + "ns");
    }
    
}

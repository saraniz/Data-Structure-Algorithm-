import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

    //FIFO data structure
    //with the highest priorities first
    //before elements with lower priority

    public static void main(String[] args){

        // Queue<Double> queue = new LinkedList<Double>();
        Queue<Double> queue = new PriorityQueue<Double>(); //descending order
        // Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder()); //ascending order


        queue.offer(2.95);
        queue.offer(3.5);
        queue.offer(4.00);
        queue.offer(1.95);

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());
            
        }
    }
    
}

//Queue 
//FIFO data structure
// A collection designed for holding elements prior to processing
// Linear data structure

//  add = enqueue, offer(), adding elements to the queue from tail
// remove = dequeue, poll(), removing elements from the queue from head
//peek()

// where are queues useful?

// 1. keyboard buffer (letters should appear on the screen in the order they're pressed)
// 2. printer queue (print jobs should be compiled in order)
// 3. used in linkedlist, priorityqueues, breadth-first search

import java.util.LinkedList;
import java.util.Queue;

public class Main1 {

    public static void main(String[] args){
    //Queue is an interface of java util package
    //Interface mean it's like template,it only defines method names but doesn't provide the actual logic
    //so we need a class to implement this interface and provide actual behavior
    //queue is an interace from java.util
    //it defines rules for how a queue should work.doessn't store any elements itself.just declare methods
    //so we cannot directly used like this,
    // Queue<String> q = new Queue<>().
    //so we used linkedlist class to implements Queue
    Queue<String> queue = new LinkedList<String>();

    queue.offer("A");
    queue.offer("B");
    queue.offer("C");
    queue.offer("D");

    queue.poll();

    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.size());
    System.out.println(queue.contains("A"));


    }
    
}

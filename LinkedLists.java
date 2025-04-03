import java.util.LinkedList;

//we can use linkedlist to mimic stacks and queues
//stores nodes in 2 parts(data+ address)
//nodes are in non-consecutive memory locations
//elements are linked using pointers

//Singly LinkedLists
//      Node                 Node                Node
// [data | address ] -> [data | address] -> [data | address]

//Doubly Linkedlist
//        Node                               Node
// [address | data | address] -> [address | data | adress]

//advantages
//1. Dynalic data structure(allocatees needed memory while running)
//2. Insertion and deletion of Node is easy. O(1)
//No/Low memory waste

//disadvantaage
//1. Greater memory usage (additional pointer)
//2. No random access of elements (no index[i])
//3. Accessing/searching elements is more time consuming. O(n)

//uses
//1. implement Stack/Queues
//2. GPS navigation
//3. music playlist

public class LinkedLists {

    public static void main(String[] args){

        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.push("E");

        // linkedlist.pop();

        linkedlist.add(3,"F");

        System.out.println(linkedlist);

    }
    
}

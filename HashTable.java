import java.util.*;
public class HashTable {

    //Hashtable = a data structure that stores uniwue keys to values ex<Integer, String>
    //each key/value pair is known as an entry
    //fast insertion, look u[, deletion of key.value pairs
    //not ideal for small data sets, great with large data sets

    //hashing  = takes a key and computes an integer (formula will vary based on key & data type)
    //in a hashtable we use the hash% capacity to calculate an index number

    //key.hashcode() % capacity  = index

    //bucket = an indexed storage location for one or more entries
    //can store multiple entries in case of a collision(linked similarly a linkedlist)

    //collision = hash function generates the same index for more than one key
    //less collisions =  more efficiency

    //runtime complexity = best case O(1)
    //                     worst case O(n)
    
    public static void main(String[] args) {

        Hashtable<Integer,String> table = new Hashtable<>(10);

        table.put(100, "Harry");
        table.put(123, "Ron");
        table.put(321, "Hermione");
        table.put(555, "Tom");
        table.put(777, "Hedwig");

        for(Integer key: table.keySet()){
            System.out.println(key.hashCode()%10 + "\t" + key + "\t" + table.get(key));
        }

        

        
    }
}

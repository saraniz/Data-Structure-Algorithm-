import java.util.*;

public class AdjacencyList {

     //adjacency list = an array/arraylist of linkedlist
    //each linkedlist has a unique node at the head
    //all adjacent neighbors to that node are added to that node's linkedlist

    //runtime complexity to check an edge O(v)
    //space complexity O(v+e)

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }
}

class Graph {
    private ArrayList<LinkedList<Node>> alist;
    private ArrayList<Node> nodes; // Store node references

    Graph() {
        alist = new ArrayList<>();
        nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
        alist.add(new LinkedList<>()); // Add an empty adjacency list for the new node
    }

    public void addEdge(int src, int dst) {
        alist.get(src).add(nodes.get(dst)); // Add destination node to source's list
    }

    public boolean checkEdge(int src, int dst) {
        return alist.get(src).contains(nodes.get(dst));
    }

    public void print() {
        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(nodes.get(i).data + " -> ");
            for (Node neighbor : alist.get(i)) {
                System.out.print(neighbor.data + " ");
            }
            System.out.println();
        }
    }
}

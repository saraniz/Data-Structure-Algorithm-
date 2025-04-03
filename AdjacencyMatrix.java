public class AdjacencyMatrix {

    //adjacency matrix = a 2D array to store 1's/0's to represent edges
    //                   # of rows = # of unique nodes
    //                   # of columns = # of unique nodes

    //runtime complexity to check on Edge O(1)
    //space complexity O(v^2)



    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}

class Node {
    char label;

    public Node(char label) {
        this.label = label;
    }
}

class Graph {
    private int[][] matrix;
    private Node[] nodes;
    private int nodeCount = 0;

    Graph(int size) {
        matrix = new int[size][size];
        nodes = new Node[size]; // Store nodes
    }

    public void addNode(Node node) {
        if (nodeCount < nodes.length) {
            nodes[nodeCount++] = node;
        } else {
            System.out.println("Graph is full. Cannot add more nodes.");
        }
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {
        System.out.print("   ");
        for (int i = 0; i < nodeCount; i++) {
            System.out.print(nodes[i].label + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes[i].label + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

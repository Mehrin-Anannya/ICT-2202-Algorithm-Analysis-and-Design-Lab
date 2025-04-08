package algorithms.with.oop.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Breadth-First Search (BFS) traversal starting from vertex 0:");
        graph.BFS(0);
	}

}

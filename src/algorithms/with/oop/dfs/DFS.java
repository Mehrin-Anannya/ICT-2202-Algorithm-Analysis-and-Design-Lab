package algorithms.with.oop.dfs;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Depth-First Search (DFS) traversal starting from vertex 0:");
        graph.DFS(0);
	}

}

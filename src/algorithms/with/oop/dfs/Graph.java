package algorithms.with.oop.dfs;

import java.util.LinkedList;

public class Graph {
        private int vertices;
        private LinkedList<Integer>[] adjacencyList;

        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                this.adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int from, int to) {
            adjacencyList[from].add(to);
        }

        public void DFS(int start) {
            boolean[] visited = new boolean[vertices];
            DFSUtil(start, visited);
        }

        private void DFSUtil(int current, boolean[] visited) {
            visited[current] = true;
            System.out.print(current + " ");

            for (int neighbor : adjacencyList[current]) {
                if (!visited[neighbor]) {
                    DFSUtil(neighbor, visited);
                }
            }
        }
}

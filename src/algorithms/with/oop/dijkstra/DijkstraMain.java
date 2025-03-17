package algorithms.with.oop.dijkstra;

public class DijkstraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Let us create the example graph discussed above
         */
        int graph[][]
            = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
                            
//   //According to theory class     
//        int graph[][] = new int[][] { { 0, 4, 5, 0, 0, 0},
//        							{ 4, 0, 11, 9, 7, 0},
//        							{ 5, 11, 0, 0, 3, 0},
//        							{ 0, 9, 0, 0, 13, 2},
//        							{ 0, 7, 3, 13, 0, 6},
//        							{ 0, 0, 0, 2, 6, 0}};
        ShortestPath t = new ShortestPath();

        // Function call
        t.dijkstra(graph, 0);
    }
}

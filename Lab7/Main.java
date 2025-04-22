/*
 * IT-2660-DSA - Lab 7
 * Student Name: Daniel Pratt
 */


package Lab7;

class Main {
  public static void main(String[] args) {
    String[] vertices = {};

    int[][] edges = {
      
    };


    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    graph.addVertex("Liberal Arts");
    graph.addVertex("Student Services");
    graph.addVertex("Health Careers & Sciences");
    graph.addVertex("Health Technologies Center");
    graph.addVertex("Recreation Center");
    graph.addVertex("Technology Learning Center");
    graph.addVertex("Business & Technology");
    graph.addVertex("Theatre");

    // edges represent directly linked areas
    graph.addEdge(new Edge(0, 7));
    graph.addEdge(new Edge(0, 1));
    graph.addEdge(new Edge(1, 0));
    graph.addEdge(new Edge(1, 2));
    graph.addEdge(new Edge(1, 5));
    graph.addEdge(new Edge(2, 1));
    graph.addEdge(new Edge(2, 3));
    graph.addEdge(new Edge(3, 2));
    graph.addEdge(new Edge(4, 2));
    graph.addEdge(new Edge(4, 1));
    graph.addEdge(new Edge(5, 1));
    graph.addEdge(new Edge(6, 7));
    graph.addEdge(new Edge(6, 1));
    graph.addEdge(new Edge(7, 0));
    graph.addEdge(new Edge(7, 6));


    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology")); // Get a dfs starting at the Business and Technology Building. Change this is you called it something different in your vertices!

    // path from Business and Technology to Health Tech Center
    dfs.printPath(3);
    System.out.println();

    // path from Business and Technology to Student Services
    dfs.printPath(1);
    System.out.println();

    // path from Business and Technology to Recreation Center
    dfs.printPath(4);
    System.out.println();

    // print tree
    dfs.printTree();

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));
    
  }
}
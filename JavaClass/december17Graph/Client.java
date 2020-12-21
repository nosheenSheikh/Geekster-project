package december17Graph;

public class Client {
  public static void main(String[] args) {
    Graph g = new Graph();
    g.addEdge("Delhi", "Jaipur", 200);
    g.addEdge("Delhi", "Amritsar", 500);
    g.addEdge("Amritsar", "Dehradun", 200);
    g.addEdge("Jaipur", "Ahmedabad", 200);
    g.addEdge("Amritsar", "Jaipur", 200);
    g.addEdge("Delhi", "Ahmedabad", 1000);
    g.addEdge("Delhi", "Surat", 1987);
    g.addEdge("Mumbai", "Bhopal",10000);
    g.addEdge("Bhopal", "Lucknow", 2000);

    g.display();

    System.out.println("==============");

    g.printAllPaths("Delhi", "Ahmedabad");

    System.out.println("==============");

    System.out.println(g.ifPathExists("Delhi", "Ahmedabad"));

    System.out.println("==============");

    g.DFSTraversal();

    System.out.println("==============");

    g.BFSTraversal();

    System.out.println("==============");

    int ans = g.shortestPathUnweighted("Delhi", "Surat");
    System.out.println(ans);
  }
}

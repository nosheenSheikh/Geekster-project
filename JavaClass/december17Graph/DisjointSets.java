package december17Graph;

public class DisjointSets {

  public class DSNode {
    String vertex;
    DSNode parent;
    int rank;

    public DSNode(String vertex) {
      this.vertex = vertex;
      this.parent = this;
      this.rank = 0;
    }


  }
}

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import adt.MatrixGraph.MatrixGraph;
import algorithms.Traversal.Traversal;
import algorithms.Traversal.Ifunction;

public class RunnerTest {
  public static void main(String[] args) {
    Graph g = new MatrixGraph(10);
    for (int i = 0; i < 25; i++) {
      g.addEdge(i, i % 2 == 0 ? 1 : 2, 1);
    }

    Traversal t = new Traversal(g, new Ifunction() {
      public void apply(int arg) {
        System.out.println("recorriendo los vertices: " + arg);
      }
    });

    t.DFS(0);
    t.BFS(0);
  }
}

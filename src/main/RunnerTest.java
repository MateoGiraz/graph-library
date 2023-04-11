import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import adt.MatrixGraph.MatrixGraph;
import algorithms.PathFinding.PathFinding;
import algorithms.Traversal.Traversal;

public class RunnerTest {

  public static void main(String[] args) {
    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 1);
    g.addEdge(0, 2, 1);
    g.addEdge(1, 3, 1);
    g.addEdge(2, 3, 1);

    Traversal.DFS(g, 0, (arg) -> {
      System.out.println(arg);
    });
  }

}

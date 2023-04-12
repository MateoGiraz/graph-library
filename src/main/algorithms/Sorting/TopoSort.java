package algorithms.Sorting;

import utils.Utils;

import adt.Edge;
import adt.Interfaces.Graph;

public class TopoSort {

  public static int[] solve(Graph g, int v) {
    boolean[] visited = Utils.initVisited(g.size());
    int[] inputDegree = Utils.initInputDegree(g);
    int[] ret = new int[g.size()];

    for (int i = 0; i < g.size(); i++) {

      int ceroInputVertex = Utils.ceroInputVertex(inputDegree, visited);

      if (ceroInputVertex == -1) {
        throw new IllegalArgumentException("Graph contains a negative cycle");
      }

      ret[i] = ceroInputVertex;
      visited[ceroInputVertex] = true;

      for (Edge e : g.edges(ceroInputVertex)) {
        if (!visited[e.vDest] && inputDegree[e.vDest] > 0) {
          inputDegree[e.vDest]--;
        }
      }

    }

    return ret;
  }

}

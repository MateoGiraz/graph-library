package algorithms.Detection;

import adt.Edge;
import adt.Interfaces.Graph;
import utils.Utils;

public class CycleDetection {

  public static boolean solve(Graph g) {
    boolean[] visited = Utils.initVisited(g.size());
    int[] inputDegree = Utils.initInputDegree(g);

    for (int i = 0; i < g.size(); i++) {

      int ceroInputVertex = Utils.ceroInputVertex(inputDegree, visited);

      if (ceroInputVertex == -1) {
        return true;
      }

      visited[ceroInputVertex] = true;

      for (Edge e : g.edges(ceroInputVertex)) {
        if (!visited[e.vDest] && inputDegree[e.vDest] > 0) {
          inputDegree[e.vDest]--;
        }
      }

    }
    return false;
  }

}

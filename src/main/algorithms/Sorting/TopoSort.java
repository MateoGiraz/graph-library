package algorithms.Sorting;

import java.util.Arrays;

import adt.Edge;
import adt.Interfaces.Graph;

public class TopoSort {

  public static int[] solve(Graph g, int v) {
    boolean[] visited = initVisited(g.size());
    int[] inputDegree = initInputDegree(g);
    int[] ret = new int[g.size()];

    for (int i = 0; i < g.size(); i++) {

      int ceroInputVertex = ceroInputVertex(inputDegree, visited);

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

  private static boolean[] initVisited(int size) {
    boolean[] ret = new boolean[size];
    Arrays.fill(ret, false);

    return ret;
  }

  private static int ceroInputVertex(int[] inputDegree, boolean[] visited) {
    for (int i = 0; i < visited.length; i++) {
      if (!visited[i] && inputDegree[i] == 0) {
        return i;
      }
    }
    return -1;
  }

  private static int[] initInputDegree(Graph g) {
    int[] ret = new int[g.size()];
    for (int i = 0; i < g.size(); i++) {
      for (Edge e : g.edges(i)) {
        if (e.vDest == i) {
          ret[i]++;
        }
      }
    }
    return ret;
  }

}

package algorithms.PathFinding;

import adt.Edge;
import adt.Interfaces.Graph;

public class PathFinding {

  public static int[] topoSort(Graph g, int v) {
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

  public static int[] dijkstra(Graph g, int v) {

    boolean[] visited = initVisited(g.size());
    int[] cost = initCost(g.size(), v);

    for (int i = 0; i < g.size(); i++) {

      int minCostVertex = minCostVertex(cost, visited);
      visited[minCostVertex] = true;

      for (Edge e : g.edges(minCostVertex)) {
        int newDistance = cost[minCostVertex] + e.weight;

        if (!visited[e.vDest] && newDistance < cost[e.vDest]) {
          cost[e.vDest] = newDistance;
        }
      }

    }

    return cost;
  }

  private static int minCostVertex(int[] cost, boolean[] visited) {
    int min = Integer.MAX_VALUE;
    int ret = 0;
    for (int i = 0; i < visited.length; i++) {
      if (!visited[i] && cost[i] < min) {
        min = cost[i];
        ret = i;
      }
    }

    return ret;
  }

  private static int[] initCost(int size, int v) {
    int[] ret = new int[size];
    for (int i = 0; i < size; i++) {
      ret[i] = Integer.MAX_VALUE;
    }
    ret[v] = 0;

    return ret;
  }

  private static boolean[] initVisited(int size) {
    boolean[] ret = new boolean[size];
    for (int i = 0; i < size; i++) {
      ret[i] = false;
    }

    return ret;
  }
}

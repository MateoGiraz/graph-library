package algorithms.MST;

import java.util.Arrays;

import adt.Edge;
import adt.Interfaces.Graph;

public class Prim {
  public static int[] solve(Graph g, int v) {

    boolean[] visited = initVisited(g.size());
    int[] cost = initCost(g.size(), v);
    int[] parent = initParent(g.size());

    for (int i = 0; i < g.size(); i++) {

      int minCostVertex = minCostVertex(cost, visited);
      visited[minCostVertex] = true;

      for (Edge e : g.edges(minCostVertex)) {
        int newDistance = e.weight;

        if (!visited[e.vDest] && newDistance < cost[e.vDest]) {
          cost[e.vDest] = newDistance;
          parent[e.vDest] = minCostVertex;
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

  private static int[] initParent(int size) {
    int[] ret = new int[size];

    Arrays.fill(ret, -1);

    return ret;
  }

  private static int[] initCost(int size, int v) {
    int[] ret = new int[size];

    Arrays.fill(ret, Integer.MAX_VALUE);
    ret[v] = 0;

    return ret;
  }

  private static boolean[] initVisited(int size) {
    boolean[] ret = new boolean[size];

    Arrays.fill(ret, false);

    return ret;
  }
}

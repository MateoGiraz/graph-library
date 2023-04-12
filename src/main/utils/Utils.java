package utils;

import java.util.Arrays;

import adt.Edge;
import adt.Interfaces.Graph;

public class Utils {

  public static int minCostVertex(int[] cost, boolean[] visited) {
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

  public static int[] initParent(int size) {
    int[] ret = new int[size];

    Arrays.fill(ret, -1);

    return ret;
  }

  public static int[] initCost(int size, int v) {
    int[] ret = new int[size];

    Arrays.fill(ret, Integer.MAX_VALUE);
    ret[v] = 0;

    return ret;
  }

  public static boolean[] initVisited(int size) {
    boolean[] ret = new boolean[size];

    Arrays.fill(ret, false);

    return ret;
  }

  public static int ceroInputVertex(int[] inputDegree, boolean[] visited) {
    for (int i = 0; i < visited.length; i++) {
      if (!visited[i] && inputDegree[i] == 0) {
        return i;
      }
    }
    return -1;
  }

  public static int[] initInputDegree(Graph g) {
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

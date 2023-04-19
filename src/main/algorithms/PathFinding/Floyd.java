package algorithms.PathFinding;

import utils.Utils;

import adt.Edge;
import adt.Interfaces.Graph;

public class Floyd {
  public static int[][] solve(Graph g) {
    int[][] cost = Utils.initCost(g.size());

    for (int i = 0; i < g.size(); i++) {
      for (Edge e : g.edges(i)) {
        cost[e.vOrigen][e.vDest] = e.weight;
      }
    }

    for (int k = 0; k < g.size(); k++) {
      for (int i = 0; i < g.size(); i++) {
        for (int j = 0; j < g.size(); j++) {
          if (changeIsBetter(cost[i][j], cost[i][k], cost[k][j])) {
            cost[i][j] = cost[i][k] + cost[k][j];
          }
        }
      }
    }

    return cost;
  }

  private static boolean changeIsBetter(int current, int a, int b) {
    return current > a + b && a != Integer.MAX_VALUE && b != Integer.MAX_VALUE;
  }
}

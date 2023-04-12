package algorithms.PathFinding;

import utils.Utils;

import adt.Edge;
import adt.Interfaces.Graph;

public class Dijkstra {

  public static int[] solve(Graph g, int v) {

    boolean[] visited = Utils.initVisited(g.size());
    int[] cost = Utils.initCost(g.size(), v);

    for (int i = 0; i < g.size(); i++) {

      int minCostVertex = Utils.minCostVertex(cost, visited);
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
}

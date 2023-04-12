package algorithms.MST;

import utils.Utils;

import adt.Edge;
import adt.Interfaces.Graph;

public class Prim {
  public static int[] solve(Graph g) {

    boolean[] visited = Utils.initVisited(g.size());
    int[] cost = Utils.initCost(g.size(), 0);
    int[] parent = Utils.initParent(g.size());

    for (int i = 0; i < g.size(); i++) {

      int minCostVertex = Utils.minCostVertex(cost, visited);
      visited[minCostVertex] = true;

      for (Edge e : g.edges(minCostVertex)) {
        int newDistance = e.weight;

        if (!visited[e.vDest] && newDistance < cost[e.vDest]) {
          cost[e.vDest] = newDistance;
          parent[e.vDest] = minCostVertex;
        }
      }

    }

    return parent;
  }
}

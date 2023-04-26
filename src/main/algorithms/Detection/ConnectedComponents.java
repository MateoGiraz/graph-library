package algorithms.Detection;

import java.util.LinkedList;
import java.util.List;

import adt.Edge;
import adt.Interfaces.Graph;
import utils.Utils;

public class ConnectedComponents {
  public static List<List<Edge>> solve(Graph g) {
    boolean[] visited = Utils.initVisited(g.size());
    List<List<Edge>> ret = new LinkedList<List<Edge>>();

    for (int i = 0; i < g.size(); i++) {
      if (!visited[i]) {
        List<Edge> component = new LinkedList<Edge>();
        dfs(g, i, visited, component);
        ret.add(component);
      }
    }

    return ret;
  }

  private static void dfs(Graph g, int i, boolean[] visited, List<Edge> component) {
    visited[i] = true;
    for (Edge e : g.edges(i)) {
      if (!visited[e.vDest]) {
        component.add(e);
        dfs(g, e.vDest, visited, component);
      }
    }
  }
}

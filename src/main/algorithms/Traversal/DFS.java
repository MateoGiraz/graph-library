package algorithms.Traversal;

import adt.Interfaces.Graph;

import java.util.*;

import adt.Edge;

public class DFS {

  public static void solve(Graph g, int v, Callback cb) {
    boolean[] visited = new boolean[g.size()];
    helper(v, g, cb, visited);
  }

  private static void helper(int v, Graph g, Callback cb, boolean[] visited) {
    visited[v] = true;
    cb.apply(v);

    for (Edge e : g.edges(v)) {
      if (!visited[e.vDest]) {
        helper(e.vDest, g, cb, visited);
      }
    }
  }

}
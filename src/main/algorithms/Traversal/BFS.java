package algorithms.Traversal;

import adt.Interfaces.Graph;

import java.util.*;

import adt.Edge;

public class BFS {

  public static void solve(Graph g, int v, Callback cb) {
    boolean[] visited = new boolean[g.size()];
    helper(v, g, cb, visited);
  }

  private static void helper(int v, Graph g, Callback cb, boolean[] visited) {
    Queue<Integer> q = new LinkedList<Integer>();

    q.add(v);

    visited[v] = true;

    while (!q.isEmpty()) {
      int vertex = q.poll();

      cb.apply(vertex);

      for (Edge e : g.edges(vertex)) {
        if (!visited[e.vDest]) {
          q.add(e.vDest);
          visited[e.vDest] = true;
        }
      }

    }
  }
}

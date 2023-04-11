package algorithms.Traversal;

import adt.Interfaces.Graph;

import java.util.*;

import adt.Edge;

public class Traversal {

  public static void DFS(Graph g, int v, Callback cb) {
    boolean[] visited = new boolean[g.size()];
    DFS(v, g, cb, visited);
  }

  private static void DFS(int v, Graph g, Callback cb, boolean[] visited) {
    visited[v] = true;
    cb.apply(v);

    for (Edge e : g.edges(v)) {
      if (!visited[e.vDest]) {
        DFS(e.vDest, g, cb, visited);
      }
    }
  }

  public static void BFS(Graph g, int v, Callback cb) {
    boolean[] visited = new boolean[g.size()];
    BFS(v, g, cb, visited);
  }

  private static void BFS(int v, Graph g, Callback cb, boolean[] visited) {
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
package algorithms.Traversal;

import adt.Interfaces.Graph;

import java.util.*;

import adt.Edge;

public class Traversal {
  Graph g;
  Ifunction func;
  boolean[] visited;

  public Traversal(Graph g, Ifunction func) {
    this.g = g;
    this.func = func;
    this.visited = new boolean[g.size()];
  }

  public void DFS(int v) {
    visited[v] = true;

    func.apply(v);

    for (Edge e : g.edges(v)) {
      if (!visited[e.vDest])
        DFS(e.vDest);
    }

  }

  public void BFS(int v) {
    Queue<Integer> q = new LinkedList<Integer>();

    q.add(v);

    visited[v] = true;

    while (!q.isEmpty()) {
      int vertex = q.poll();

      func.apply(vertex);

      for (Edge e : g.edges(vertex)) {
        if (!visited[e.vDest]) {
          q.add(e.vDest);
          visited[e.vDest] = true;
        }
      }

    }
  }

}

package adt.LinkedGraph;

import adt.Edge;
import adt.Interfaces.Graph;

@SuppressWarnings("unchecked")

public class LinkedGraph implements Graph {

  private int totalElems;
  private int edges;
  private Object[] arr;

  public LinkedGraph(int elems) {
    edges = 0;
    totalElems = elems;
    arr = new Object[totalElems + 1];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new EdgeLinkedList<Edge>();
    }

  }

  private boolean isOutOfRange(int v, int w) {
    return v < 0 || w < 0 || v >= arr.length || w >= arr.length;
  }

  @Override
  public int size() {
    return arr.length - 1;
  }

  @Override
  public void addEdge(int v, int w, int weight) {
    if (isOutOfRange(v, w) || hasEdge(v, w))
      return;

    Edge edge = new Edge(v, w, weight);
    ((EdgeLinkedList<Edge>) (arr[v])).addElement(edge);
    edges++;
  }

  @Override
  public int edgeCount(int v) {
    return ((EdgeLinkedList<Edge>) (arr[v])).totalElements();
  }

  @Override
  public int edgeCount() {
    return edges;
  }

  @Override
  public boolean hasEdge(int v, int w) {
    for (Edge e : edges(v))
      if (e.vDest == w)
        return true;
    return false;
  }

  @Override
  public int getWeight(int v, int w) {
    for (Edge e : edges(v))
      if (e.vDest == w)
        return e.weight;
    return -1;
  }

  @Override
  public void removeEdge(int v, int w) {
    Edge e = new Edge(v, w, 0);
    ((EdgeLinkedList<Edge>) (arr[v])).removeElement(e);
    edges--;
  }

  @Override
  public Iterable<Edge> edges(int v) {
    return ((EdgeLinkedList<Edge>) (arr[v])).data();
  };
}
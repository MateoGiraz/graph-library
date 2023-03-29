package adt.MatrixGraph;

import adt.Edge;
import adt.Interfaces.Graph;
import adt.Interfaces.List;
import adt.LinkedGraph.EdgeLinkedList;

public class MatrixGraph implements Graph {
  int[][] mat;
  int edgeCount;
  int[] vertexEdgeCount;

  public MatrixGraph(int elems) {
    edgeCount = 0;
    mat = new int[elems][elems];
    vertexEdgeCount = new int[elems];
  }

  @Override
  public int size() {
    return mat.length;
  }

  @Override
  public void addEdge(int v, int w, int weight) {
    if (isOutOfRange(v, w))
      return;

    if (!isDefined(v, w)) {
      edgeCount++;
      vertexEdgeCount[v]++;
    }

    mat[v][w] = weight;
  }

  private boolean isOutOfRange(int v, int w) {
    return v < 0 || w < 0 || v >= mat.length || w >= mat.length;
  }

  @Override
  public int edgeCount(int v) {
    return vertexEdgeCount[v];
  }

  @Override
  public int edgeCount() {
    return edgeCount;
  }

  @Override
  public Iterable<Edge> edges(int v) {
    List<Edge> list = new EdgeLinkedList<Edge>();

    for (int i = 0; i < mat.length; i++) {
      if (isDefined(v, i)) {
        list.addElement(new Edge(v, i, mat[v][i]));
      }
    }

    return list.data();
  }

  private boolean isDefined(int v, int i) {
    return mat[v][i] != 0;
  }

  @Override
  public boolean hasEdge(int v, int w) {
    if (isOutOfRange(v, w) || !isDefined(v, w))
      return false;
    return true;
  }

  @Override
  public int getWeight(int v, int w) {
    if (isOutOfRange(v, w) || !isDefined(v, w))
      return -1;
    return mat[v][w];
  }

  @Override
  public void removeEdge(int v, int w) {
    if (isOutOfRange(v, w))
      return;
    mat[v][w] = 0;
    edgeCount--;
    vertexEdgeCount[v]--;
  }

}
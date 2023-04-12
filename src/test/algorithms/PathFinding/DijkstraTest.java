package test.algorithms.PathFinding;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import algorithms.PathFinding.Dijkstra;

public class DijkstraTest {

  @Test
  public void simpleGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 3, 4);
    g.addEdge(2, 3, 1);

    int[] arr = { 0, 2, 3, 4 };
    int[] result = Dijkstra.solve(g, 0);

    assertArrayEquals(result, arr);
  }

  @Test
  public void negativeEdge_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, -1);
    g.addEdge(1, 3, 4);
    g.addEdge(2, 3, 1);

    int[] arr = { 0, 2, -1, 0 };
    int[] result = Dijkstra.solve(g, 0);

    assertArrayEquals(result, arr);
  }

  @Test
  public void disconnectedGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);

    int[] arr = { 0, 2, 3, Integer.MAX_VALUE };
    int[] result = Dijkstra.solve(g, 0);

    assertArrayEquals(result, arr);
  }

  @Test
  public void largeGraph_OkTest() {

    Graph g = new LinkedGraph(7);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 3, 4);
    g.addEdge(1, 4, 6);
    g.addEdge(2, 4, 1);
    g.addEdge(4, 5, 1);
    g.addEdge(3, 5, 5);
    g.addEdge(5, 6, 2);

    int[] arr = { 0, 2, 3, 6, 4, 5, 7 };
    int[] result = Dijkstra.solve(g, 0);

    assertArrayEquals(result, arr);
  }

  @Test
  public void loopGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 0, 5);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 3, 4);
    g.addEdge(2, 3, 1);

    int[] arr = { 0, 2, 3, 4 };
    int[] result = Dijkstra.solve(g, 0);

    assertArrayEquals(result, arr);
  }

  @Test
  public void multipleShortestPathGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 3, 4);
    g.addEdge(2, 3, 1);
    g.addEdge(1, 4, 1);
    g.addEdge(4, 3, 2);

    int[] arr = { 0, 2, 3, 4, 3 };
    int[] result = Dijkstra.solve(g, 0);

    assertArrayEquals(result, arr);
  }

}

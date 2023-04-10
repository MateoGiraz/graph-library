package test.algorithms.PathFinding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;

public class DijkstraTest {

  @Test
  public void simpleGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 3, 4);
    g.addEdge(2, 3, 1);

    int[] arr = { 0, 2, 3, 4 };
    assertEquals(/* g.dijkstra(0) */1, arr);
  }

  @Test
  public void negativeEdge_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, -1);
    g.addEdge(1, 3, 4);
    g.addEdge(2, 3, 1);

    int[] arr = { 0, 2, -1, 3 };
    assertEquals(/* g.dijkstra(0) */1, arr);
  }

  @Test
  public void disconnectedGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 3, 4);

    int[] arr = { 0, 2, 3, Integer.MAX_VALUE };
    assertEquals(/* g.dijkstra(0) */1, arr);
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

    int[] arr = { 0, 2, 3, 7, 9, 10, 12 };
    assertEquals(/* g.dijkstra(0) */1, arr);
  }

  @Test
  public void negativeCycleGraph_ThrowsTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, -1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 1, -3);

    // expect to throw: Graph contains a negative cycle.
  }

  @Test
  public void loopGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 0, 5);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 3, 4);
    g.addEdge(2, 3, 1);

    int[] arr = { 0, 2, 3, 7 };
    assertEquals(/* g.dijkstra(0) */1, arr);
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
    assertEquals(/* g.dijkstra(0) */1, arr);
  }

}

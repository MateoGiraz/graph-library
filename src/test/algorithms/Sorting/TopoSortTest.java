package test.algorithms.Sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import algorithms.Sorting.TopoSort;;

public class TopoSortTest {

  @Test
  public void simpleGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 1);
    g.addEdge(0, 2, 1);
    g.addEdge(1, 3, 1);
    g.addEdge(2, 3, 1);

    int[] arr = { 0, 1, 2, 3 };
    int[] result = TopoSort.solve(g, 0);

    assertArrayEquals(result, arr);
  }

  @Test
  public void largeGraph_OkTest() {

    Graph g = new LinkedGraph(6);
    g.addEdge(0, 1, 1);
    g.addEdge(0, 2, 1);
    g.addEdge(0, 3, 1);
    g.addEdge(1, 4, 1);
    g.addEdge(1, 5, 1);
    g.addEdge(2, 4, 1);
    g.addEdge(2, 5, 1);
    g.addEdge(3, 4, 1);
    g.addEdge(3, 5, 1);

    int[] arr = { 0, 1, 2, 3, 4, 5 };
    int[] result = TopoSort.solve(g, 0);

    assertArrayEquals(result, arr);
  }

  @Test
  public void negativeCycleGraph_ThrowsTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 1);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 0, 1);
    g.addEdge(2, 3, 1);

    // expect to throw: Graph contains a negative cycle.
  }

  @Test
  public void disconnectedGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 1);
    g.addEdge(0, 2, 1);
    g.addEdge(3, 4, 1);

    int[] arr = { 0, 1, 2, 3, 4 };
    int[] result = TopoSort.solve(g, 0);

    assertArrayEquals(result, arr);
  }

}

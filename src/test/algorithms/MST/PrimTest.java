package test.algorithms.MST;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import algorithms.MST.Prim;

public class PrimTest {

  @Test
  public void simpleGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 2, 3);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);

    int[] arr = { -1, 0, 1, 2, 3 };
    int[] result = Prim.solve(g);

    assertArrayEquals(result, arr);
  }

  @Test
  public void disconnectedGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 3);
    g.addEdge(3, 4, 4);

    int[] arr = { -1, 0, 1, -1, -1 };
    int[] result = Prim.solve(g);

    assertArrayEquals(result, arr);
  }

  @Test
  public void loopGraph_OkTest() {

    Graph g = new LinkedGraph(4);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 3);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 0, 5);

    int[] arr = { -1, 0, 1, 2 };
    int[] result = Prim.solve(g);

    assertArrayEquals(result, arr);
  }

  @Test
  public void equalWeights_OkTest() {

    Graph g = new LinkedGraph(7);
    g.addEdge(0, 1, 5);
    g.addEdge(0, 2, 5);
    g.addEdge(1, 3, 5);
    g.addEdge(2, 4, 5);
    g.addEdge(3, 5, 5);
    g.addEdge(4, 6, 5);

    int[] arr = { -1, 0, 0, 1, 2, 3, 4 };
    int[] result = Prim.solve(g);

    assertArrayEquals(result, arr);
  }

  @Test
  public void largeGraph_OkTest() {

    Graph g = new LinkedGraph(9);
    g.addEdge(0, 1, 4);
    g.addEdge(0, 7, 8);
    g.addEdge(1, 2, 8);
    g.addEdge(1, 7, 11);
    g.addEdge(2, 3, 7);
    g.addEdge(2, 8, 2);
    g.addEdge(2, 5, 4);
    g.addEdge(3, 4, 9);
    g.addEdge(3, 5, 14);
    g.addEdge(4, 5, 10);
    g.addEdge(5, 6, 2);
    g.addEdge(6, 7, 1);
    g.addEdge(6, 8, 6);

    int[] arr = { -1, 0, 1, 2, 3, 2, 5, 6, 2 };
    int[] result = Prim.solve(g);

    assertArrayEquals(result, arr);
  }

}

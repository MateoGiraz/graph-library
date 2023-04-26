package test.algorithms.Coloring;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import algorithms.Coloring.GreedyColoring;

public class GreedyColoringTest {
  @Test
  public void simpleGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 1);
    g.addEdge(1, 0, 1);

    g.addEdge(0, 2, 1);
    g.addEdge(2, 0, 1);

    g.addEdge(1, 2, 1);
    g.addEdge(2, 1, 1);

    g.addEdge(1, 3, 1);
    g.addEdge(3, 1, 1);

    g.addEdge(2, 3, 1);
    g.addEdge(3, 2, 1);

    g.addEdge(3, 4, 1);
    g.addEdge(4, 3, 1);

    int[] expectedOutput = { 0, 1, 2, 0, 1 };
    int[] result = GreedyColoring.solve(g);

    assertArrayEquals(result, expectedOutput);
  }

  @Test
  public void simpleGraphTwo_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 1);
    g.addEdge(1, 0, 1);

    g.addEdge(0, 2, 1);
    g.addEdge(2, 0, 1);

    g.addEdge(1, 3, 1);
    g.addEdge(3, 1, 1);

    g.addEdge(2, 3, 1);
    g.addEdge(3, 2, 1);

    g.addEdge(3, 4, 1);
    g.addEdge(4, 3, 1);

    g.addEdge(4, 0, 1);
    g.addEdge(0, 4, 1);

    int[] expectedOutput = { 0, 1, 1, 0, 1 };
    int[] result = GreedyColoring.solve(g);

    assertArrayEquals(result, expectedOutput);
  }
}

package test.algorithms.Detection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import algorithms.Detection.CycleDetection;

public class CycleDetectionTest {
  @Test
  public void simpleCyclicGraph_OkTest() {

    Graph g = new LinkedGraph(6);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);
    g.addEdge(4, 0, 5);

    boolean result = CycleDetection.solve(g);

    assertTrue(result);
  }

  @Test
  public void simpleNonCyclicGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);

    boolean result = CycleDetection.solve(g);

    assertFalse(result);
  }
}

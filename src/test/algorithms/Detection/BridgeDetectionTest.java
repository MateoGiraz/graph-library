package test.algorithms.Detection;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import adt.Edge;
import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import algorithms.Detection.BridgeDetection;

public class BridgeDetectionTest {
  @Test
  public void simpleGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);

    List<Edge> result = BridgeDetection.solve(g);

    assertEquals(4, result.size());
  }

  @Test
  public void simpleGraph2_OkTest() {

    Graph g = new LinkedGraph(8);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 7, 2);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);
    g.addEdge(4, 0, 5);
    g.addEdge(5, 6, 5);
    g.addEdge(6, 7, 5);
    g.addEdge(7, 5, 5);

    List<Edge> result = BridgeDetection.solve(g);

    assertEquals(7, result.size());
  }

  @Test
  public void undirectedGraph_OkTest() {

    Graph g = new LinkedGraph(8);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 0, 2);

    g.addEdge(1, 2, 1);
    g.addEdge(2, 1, 2);

    g.addEdge(1, 3, 1);
    g.addEdge(3, 1, 2);

    g.addEdge(2, 3, 4);
    g.addEdge(3, 2, 5);

    g.addEdge(3, 4, 5);
    g.addEdge(4, 3, 5);

    List<Edge> result = BridgeDetection.solve(g);

    assertEquals(2, result.size());
  }
}

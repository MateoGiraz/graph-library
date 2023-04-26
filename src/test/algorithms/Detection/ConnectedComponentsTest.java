
package test.algorithms.Detection;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import adt.Edge;
import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
import algorithms.Detection.ConnectedComponents;

public class ConnectedComponentsTest {
  @Test
  public void simpleGraph_OkTest() {

    Graph g = new LinkedGraph(5);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);
    g.addEdge(4, 0, 5);

    List<List<Edge>> result = ConnectedComponents.solve(g);

    assertEquals(1, result.size());
    assertEquals(4, result.get(0).size());
  }

  @Test
  public void simpleGraph2_OkTest() {

    Graph g = new LinkedGraph(7);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);
    g.addEdge(4, 0, 5);
    g.addEdge(5, 6, 5);

    List<List<Edge>> result = ConnectedComponents.solve(g);

    assertEquals(2, result.size());
    assertEquals(4, result.get(0).size());
    assertEquals(1, result.get(1).size());
  }

  @Test
  public void simpleGraph3_OkTest() {

    Graph g = new LinkedGraph(10);
    g.addEdge(0, 1, 2);
    g.addEdge(1, 2, 1);
    g.addEdge(2, 3, 4);
    g.addEdge(3, 4, 5);
    g.addEdge(4, 0, 5);
    g.addEdge(5, 6, 5);
    g.addEdge(6, 7, 5);
    g.addEdge(8, 9, 1);

    List<List<Edge>> result = ConnectedComponents.solve(g);

    assertEquals(3, result.size());
    assertEquals(4, result.get(0).size());
    assertEquals(2, result.get(1).size());
    assertEquals(1, result.get(2).size());
  }
}
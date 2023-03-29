package test.GraphTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import adt.Interfaces.Graph;
import adt.LinkedGraph.LinkedGraph;
//import adt.MatrixGraph.MatrixGraph;

public class GraphTest {

  @Test
  public void canCreateGraphOkTest() {
    new LinkedGraph(0);
  }

  @Test
  public void sizeIs0_initializedWith0Graph_OkTest() {
    Graph g = new LinkedGraph(0);
    assertEquals(g.size(), 0);
  }

  @Test
  public void sizeIs1_initializedWith1Graph_OkTest() {
    Graph g = new LinkedGraph(1);
    assertEquals(g.size(), 1);
  }

  @Test
  public void sizeIs2_initializedWith2Graph_OkTest() {
    Graph g = new LinkedGraph(2);
    assertEquals(g.size(), 2);
  }

  @Test
  public void addUnweightedEdge_0_0_1_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
  }

  @Test
  public void addUnweightedEdge_Neg1_Neg1_1_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(-1, -1, 1);
  }

  @Test
  public void addUnweightedEdge_matLength_matLength_1_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(g.size(), g.size(), 1);
  }

  @Test
  public void edgeCountIs0_initializedGraph_TestOk() {
    Graph g = new LinkedGraph(10);
    assertEquals(g.edgeCount(), 0);
  }

  @Test
  public void edgeCountIs1_addedOneEdge_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    assertEquals(g.edgeCount(), 1);
  }

  @Test
  public void edgeCountIs2_addedTwoEdges_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    g.addEdge(1, 0, 1);
    assertEquals(g.edgeCount(), 2);
  }

  @Test
  public void edgeCountIs1_addedTwoOverridingEdges_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    g.addEdge(0, 0, 1);
    assertEquals(g.edgeCount(), 1);
  }

  @Test
  public void vertexEdgeCountIs0_initializedGraph_TestOk() {
    Graph g = new LinkedGraph(10);
    assertEquals(g.edgeCount(0), 0);
  }

  @Test
  public void vertexEdgeCountIs1_addedOneEdge_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    assertEquals(g.edgeCount(0), 1);
  }

  @Test
  public void hasEdgeisFalse_GraphInitialized_TestOk() {
    Graph g = new LinkedGraph(10);
    assertFalse(g.hasEdge(0, 0));
  }

  @Test
  public void hasEdgeisTrue_addedOneEdge_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    assertTrue(g.hasEdge(0, 0));
  }

  @Test
  public void hasEdgeisTrue_addedTwoEdge_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    g.addEdge(1, 2, 1);
    assertTrue(g.hasEdge(0, 0));
  }

  @Test
  public void getWeightIsNeg1_GraphInitialized_TestOk() {
    Graph g = new LinkedGraph(10);
    assertEquals(g.getWeight(0, 0), -1);
  }

  @Test
  public void getWeightIs1_addedOneUnweightedEdge_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    assertEquals(g.getWeight(0, 0), 1);
  }

  @Test
  public void getWeightIs5_addedOneWeightedEdge_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 5);
    assertEquals(g.getWeight(0, 0), 5);
  }

  @Test
  public void removeEdge_InitializedGraph_TestOk() {
    Graph g = new LinkedGraph(10);
    g.removeEdge(0, 0);
    assertFalse(g.hasEdge(0, 0));
  }

  @Test
  public void removeEdge_addedOneEdge_TestOk() {
    Graph g = new LinkedGraph(10);
    g.addEdge(0, 0, 1);
    g.removeEdge(0, 0);
    assertFalse(g.hasEdge(0, 0));
    assertEquals(g.edgeCount(0), 0);
    assertEquals(g.edgeCount(), 0);
  }

}

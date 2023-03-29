package test.ListTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import adt.Edge;
import adt.Interfaces.List;
import adt.LinkedGraph.EdgeLinkedList;

public class ListTest {

  @Test
  public void canCreateList_OkTest() {
    new EdgeLinkedList<>();
  }

  @Test
  public void totalElementsIs0_initialized_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    assertEquals(list.totalElements(), 0);
  }

  @Test
  public void totalElementsIs1_insertOneEdge_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.addElement(new Edge(0, 0, 0));
    assertEquals(list.totalElements(), 1);
  }

  @Test
  public void totalElementsIs2_insertTwoEdges_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.addElement(new Edge(0, 0, 0));
    list.addElement(new Edge(1, 0, 0));
    assertEquals(list.totalElements(), 2);
  }

  @Test
  public void totalElementsIs2_insertTwiceSameEdge_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.addElement(new Edge(0, 0, 0));
    list.addElement(new Edge(0, 0, 0));
    assertEquals(list.totalElements(), 2);
  }

  @Test
  public void addElement_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.addElement(new Edge(0, 0, 0));
    assertEquals(list.totalElements(), 1);
  }

  @Test
  public void addNegElement_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.addElement(new Edge(-1, 0, 0));
    assertEquals(list.totalElements(), 1);
  }

  @Test
  public void addElement_Neg_Weight_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.addElement(new Edge(0, 0, -1));
    assertEquals(list.totalElements(), 1);
  }

  @Test
  public void removeElement_notIncluded_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.removeElement(new Edge(0, 0, -1));
    assertEquals(list.totalElements(), 0);
  }

  @Test
  public void removeElement_included_OkTest() {
    List<Edge> list = new EdgeLinkedList<>();
    list.addElement(new Edge(0, 0, -1));
    list.removeElement(new Edge(0, 0, -1));
    assertEquals(list.totalElements(), 0);
  }

}

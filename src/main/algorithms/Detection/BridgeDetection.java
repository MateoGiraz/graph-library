package algorithms.Detection;

import java.util.LinkedList;
import java.util.List;

import adt.Edge;
import adt.Interfaces.Graph;

public class BridgeDetection {
  public static List<Edge> solve(Graph g) {
    int ConnectedComponentsCount = ConnectedComponents.solve(g).size();
    List<Edge> ret = new LinkedList<Edge>();

    for (int i = 0; i < g.size(); i++) {
      for (Edge e : g.edges(i)) {
        g.removeEdge(e.vOrigen, e.vDest);
        int newConnectedComponentsCount = ConnectedComponents.solve(g).size();
        if (newConnectedComponentsCount > ConnectedComponentsCount) {
          ret.add(e);
        }
        g.addEdge(e.vOrigen, e.vDest, e.weight);
      }
    }

    return ret;
  }
}

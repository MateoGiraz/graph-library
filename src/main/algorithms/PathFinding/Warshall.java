package algorithms.PathFinding;

import utils.Utils;

import adt.Edge;
import adt.Interfaces.Graph;

public class Warshall {
  public static boolean[][] solve(Graph g) {
    boolean[][] isPath = Utils.initBoolMat(g.size());

    for (int i = 0; i < g.size(); i++) {
      for (Edge e : g.edges(i)) {
        isPath[e.vOrigen][e.vDest] = true;
      }
    }

    for (int k = 0; k < g.size(); k++) {
      for (int i = 0; i < g.size(); i++) {
        for (int j = 0; j < g.size(); j++) {
          if (!isPath[i][j]) {
            isPath[i][j] = isPath[i][k] && isPath[k][j];
          }
        }
      }
    }

    return isPath;
  }

}

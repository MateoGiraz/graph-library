package algorithms.Coloring;

import java.util.Arrays;

import adt.Edge;
import adt.Interfaces.Graph;

public class GreedyColoring {
  public static int[] solve(Graph g) {

    int graphSize = g.size();
    int[] colors = new int[graphSize];
    Arrays.fill(colors, -1);

    boolean[] usedColors = new boolean[graphSize];

    colors[0] = 0;
    usedColors[0] = true;

    for (int v = 1; v < graphSize; v++) {
      Arrays.fill(usedColors, false); // Reset used colors for each vertex

      for (Edge e : g.edges(v)) {
        if (colors[e.vDest] != -1) {
          usedColors[colors[e.vDest]] = true;
        }
      }

      int color;
      for (color = 0; color < graphSize; color++) {
        if (!usedColors[color]) {
          break;
        }
      }

      colors[v] = color;
    }
    return colors;
  }
}
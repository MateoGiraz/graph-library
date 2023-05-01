# Implemented algorithms

1. Traversal
    1. [Breadth-first search](#bfs)
    2. [Depth-first search](#dfs)
2. Sorting
    1. [Topological sort](#toposort)
3. Path Finding
    1. [Dijkstra's algorithm](#dijkstra)
    2. [Floyd's algorithm](#floyd)
    3. [Warshall's algorithm](#warshall)
4. Minimum Spanning Tree
    1. [Prim's algorithm](#prim)
5. Coloring
    1. [Greedy Coloring algorithm](#greedycoloring)
6. Detection
    1. [Cycle Detection algorithm](#cycledetection)
    2. [Connected Components algorithm](#conncomponents)
    3. [Bridge Detection algorithm](#bridge)


    
<br />

# Traversal

### Breadth-first search <a name="bfs"></a>
BFS algorithm recibes the graph to be traversed, starting vertex and a callback function to be executed on every node.

```javascript
import algorithms.Traversal.BFS;

BFS.solve(g, 0, (arg) -> {
    System.out.println(arg);
});
```

### Depth-first search <a name="dfs"></a>
DFS algorithm recibes the graph to be traversed, starting vertex and a callback function to be executed on every node.

```javascript
import algorithms.Traversal.DFS;

DFS.solve(g, 0, (arg) -> {
    System.out.println(arg);
});
```
<br />

# Sorting 

### Topological Sort <a name="toposort"></a>
Topological sort algorithm recibes a graph, and returns a sorted array representing one possible topological sort.

```javascript
import algorithms.Sorting.TopoSort;

int[] result = TopoSort.solve(g);
```
<br />

# PathFinding

### Dijkstra's algorithm <a name="dijkstra"></a>
Dijkstra's algorithm recibes a graph, starting index, and returns an array representing minimum travelling cost to every node.

```javascript
import algorithms.PathFinding.Dijkstra;

int[] result = Dijkstra.solve(g, 0);
```

### Floyd's algorithm <a name="floyd"></a>
Floyd's algorithm recibes a graph and returns a matrix representing minimum travelling between every node.

```javascript
import algorithms.PathFinding.Floyd;

int[][] result = Floyd.solve(g);
```

### Warshall's algorithm <a name="warshall"></a>
Warshall's algorithm recibes a graph and returns a matrix representing wether there is a path between nodes.

```javascript
import algorithms.PathFinding.Warshall;

boolean[][] result = Warshall.solve(g);
```

<br />

# Minimun Spanning Tree

### Prim's algorithm <a name="prim"></a>
Prim's algorithm recibes a graph, and returns an array in which every node (position) contains its parent. Therefore MST can be constructed.

```javascript
import algorithms.MST.Prim;

int[] result = Prim.solve(g);
```
<br />

# Graph Coloring

### Greedy Coloring algorithm <a name="greedycoloring"></a>
Greedy Coloring algorithm recibes an undirected graph, and returns an array in which every node (position) contains its corresponding color (represented as integer). Coloring makes no sense for directed graphs.

```javascript
import algorithms.Coloring.GreedyColoring;

int[] result = GreedyColoring.solve(g);
```
<br />

# Detection

### Cycle Detection algorithm <a name="cycledetection"></a>
Cycle Detection algorithm recibes a directed graph, and returns wether it contains a cycle.

```javascript
import algorithms.Detection.CycleDetection;

boolean result = CycleDetection.solve(g);
```

### Connected Components algorithm <a name="conncomponents"></a>
Connected Components algorithm recibes a graph, and returns a list of connected components (Edge list)

```javascript
import adt.Edge;
import algorithms.Detection.ConnectedComponents;

 List<List<Edge>> result = ConnectedComponents.solve(g);
 totalComponents = result.size();
```

### Bridge Detection algorithm <a name="bridge"></a>
Connected Components algorithm recibes a graph, and returns a list of bridges (Edge list). If graph is directed, algorithm solves strongly connected components problem.

```javascript
import adt.Edge;
import algorithms.Detection.BridgeDetection;

List<Edge> result = BridgeDetection.solve(g);
```

<br />


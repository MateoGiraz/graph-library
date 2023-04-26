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

<br />


# Algorithm ideas:

Bridge Detection

A\* search algorithm\
Alpha–beta pruning\
Aperiodic graph

B\*
Barabási–Albert model\
Belief propagation\
Bellman–Ford algorithm\
Bianconi–Barabási model\
Bidirectional search\
Blossom algorithm\
Borůvka's algorithm\
Bottleneck traveling salesman problem\
Bron–Kerbosch algorithm\
Bully algorithm

Centrality\
Chaitin's algorithm\
Christofides algorithm\
Clique percolation method\
Closure problem\
Color-coding\
Colour refinement algorithm\
Contraction hierarchies\
Courcelle's theorem\
Cuthill–McKee algorithm

D\*\
Degeneracy (graph theory)\
Dijkstra–Scholten algorithm\
Dinic's algorithm\
Disparity filter algorithm of weighted network\
Double pushout graph rewriting\
DSatur\
Dulmage–Mendelsohn decomposition\
Dynamic connectivity\
Dynamic link matching

Edmonds–Karp algorithm\
Edmonds' algorithm\
Euler tour technique\
External memory graph traversal\
Extremal Ensemble Learning

FKT algorithm\
Floyd–Warshall algorithm\
Force-directed graph drawing\
Ford–Fulkerson algorithm\
Fringe search

Gallai–Edmonds decomposition\
Girvan–Newman algorithm\
Goal node (computer science)\
Gomory–Hu tree\
Graph bandwidth\
Graph edit distance\
Graph embedding\
Graph isomorphism\
Graph isomorphism problem\
Graph kernel\
Graph neural network\
Graph reduction\
Graph traversal

Hall-type theorems for hypergraphs\
Havel–Hakimi algorithm\
HCS clustering algorithm\
Hierarchical closeness\
Hierarchical clustering of networks\
Hopcroft–Karp algorithm

Iterative deepening A\*\
Initial attractiveness\
Iterative compression\
Iterative deepening depth-first search\
Johnson's algorithm\
Journal of Graph Algorithms and Applications\
Jump point search\
Junction tree algorithm

K shortest path routing\
Karger's algorithm\
KHOPCA clustering algorithm\
Kleitman–Wang algorithms\
Knight's tour\
Knowledge graph embedding\
Knuth's Simpath algorithm\
Kosaraju's algorithm\
Kruskal's algorithm

LASCNN algorithm\
Lexicographic breadth-first search\
Link prediction\
Longest path problem

MaxCliqueDyn maximum clique algorithm\
METIS\
Minimax\
Minimum bottleneck spanning tree\
Misra & Gries edge coloring algorithm

Nearest neighbour algorithm\
Network flow problem\
Network simplex algorithm\
Nonblocking minimal spanning switch

PageRank\
Parallel all-pairs shortest path algorithm\
Parallel breadth-first search\
Parallel single-source shortest path algorithm\
Path-based strong component algorithm\
Pre-topological order\
Proof-number search\
Push–relabel maximum flow algorithm

Recursive largest first algorithm\
Reverse-delete algorithm\
Rocha–Thatte cycle detection algorithm

Seidel's algorithm\
Sethi–Ullman algorithm\
Shortest path faster algorithm\
SMA\*\
Spectral layout\
Spreading activation\
Stoer–Wagner algorithm\
Subgraph isomorphism problem\
Suurballe's algorithm

Tarjan's off-line lowest common ancestors algorithm\
Tarjan's strongly connected components algorithm\
Theta\*\
Transit node routing\
Transitive closure\
Transitive reduction\
Travelling salesman problem\
Tree traversal

Widest path problem\
Wiener connector

Yen's algorithm

Zero-weight cycle problem

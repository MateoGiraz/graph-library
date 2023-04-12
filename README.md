<br />

# Implemented algorithms

1. Traversal
    1. [Breadth-first search](#bfs)
    2. [Depth-first search](#dfs)
2. Sorting
    1. [Topological sort](#toposort)
3. Path Finding
    1. [Dijkstra's algorithm](#dijkstra)
4. Minimum Spanning Tree
    1. [Prim's algorithm](#prim)
    
<br />

# Traversal

### Breadth-first search <a name="bfs"></a>
BFS algorithm recibes the graph to be traversed, starting vertex and a callback function to be executed on every node.

```java
import algorithms.Traversal.BFS;

BFS.solve(g, 0, (arg) -> {
    System.out.println(arg);
});
```

### Depth-first search <a name="dfs"></a>
DFS algorithm recibes the graph to be traversed, starting vertex and a callback function to be executed on every node.

```java
import algorithms.Traversal.DFS;

DFS.solve(g, 0, (arg) -> {
    System.out.println(arg);
});
```
<br />

# Sorting 

### Topological Sort <a name="toposort"></a>
Topological sort algorithm recibes a graph, and returns a sorted array representing one possible topological sort.

```java
import algorithms.Sorting.TopoSort;

int[] result = TopoSort.solve(g);
```
<br />

# PathFinding

### Dijkstra's algorithm <a name="dijkstra"></a>
Dijkstra's algorithm recibes a graph, starting index, and returns an array representing minimum travelling cost to every node.

```java
import algorithms.PathFinding.Dijkstra;

int[] result = Dijkstra.solve(g, 0);
```

<br />

# Minimun Spanning Tree

### Prim's algorithm <a name="prim"></a>
Prim's algorithm recibes a graph, and returns an array in which every node (position) contains its parent. Therefore MST can be constructed.

```java
import algorithms.MST.Prim;

int[] result = Prim.solve(g);
```

<br />

# Algorithm ideas:

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

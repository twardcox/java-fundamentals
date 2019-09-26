package code401challenges.BreadthFirst;

import java.util.*;

public class Graph {

  public HashMap<Vertex, ArrayList<Edge>> adjacencyList;
//  public HashMap<T, Vertex> valueMap;
  private int _size = 0;

  public Graph(){
    adjacencyList = new HashMap<>();
//    valueMap = new HashMap<>();
  }

  public Vertex addNode(String value){
    Vertex node = new Vertex(value);
    ArrayList<Edge> edge = new ArrayList<>();
    this.adjacencyList.putIfAbsent(node, edge);
    return node;
  }



  public void removeVertex(String value){
    for ( Vertex v : adjacencyList.keySet()){
      if (v.getValue().equals(value)){
        adjacencyList.remove(v);
      } else {
        ArrayList<Edge> list = adjacencyList.get(v);

        for (Edge e : list){
          if (e.getVertex().getValue().equals(value)){
            list.remove(e);
          }
        }
      }
    }
  }

  public Edge addUndirectedEdge(Vertex a, Vertex b, int weightA, int weightB){
    Edge eToA = new Edge(weightA, a);
    Edge eToB = new Edge(weightB, b);

    ArrayList<Edge> listA = adjacencyList.get(a);
    ArrayList<Edge> listB = adjacencyList.get(b);

    listA.add(eToB);
    listB.add(eToA);

    return eToA;
  }

  public Edge addDirectedEdge(Vertex a, Vertex b, int weight){

    Edge edge = new Edge(weight, b);
    ArrayList<Edge> listA = adjacencyList.get(a);
    listA.add(edge);
    return edge;

  }

  public Edge removeEdge(Vertex a, Vertex b){
    ArrayList<Edge> adjacentA = adjacencyList.get(a);
    if (adjacentA != null){
      for (Edge e : adjacentA){
        if (e.getVertex().equals(b)){
          adjacentA.remove(e);
          return e;
        }
      }
    }
    return null;
  }

  public ArrayList<Edge> getNodesFromString( String value){

    for (Vertex vertex : adjacencyList.keySet()){
      if (vertex.getValue().equals(value)){
        return this.adjacencyList.get(vertex);
      }
    }

    return null;
  }

  public ArrayList<Edge> getAdjacentVertsOf(Vertex v){
    return this.adjacencyList.get(v);
  }

  public boolean has(String value){
    for (Vertex v : adjacencyList.keySet()){
      if (v.getValue().equals(value)){
        return true;
      }
    }
    return false;
  }

  public String print(Vertex v){
    StringBuilder sb = new StringBuilder("");
    ArrayList<Edge> list = this.adjacencyList.get(v);
    if (!list.isEmpty()){
      for (Edge e : list){
        sb.append(e.print());
      }
    }
    return sb.toString();
  }

  public int size(){
    return this.adjacencyList.size();
  }


  public List<Vertex> breadthFirstTraversal(Vertex root){

    Vertex current = root;
    List<Vertex> seen = new ArrayList<>(1);
    Queue<Vertex> toSee = new LinkedList<>();

    seen.add(root);
    toSee.add(root);

    while (current != null){

      List<Edge> row = this.adjacencyList.get(current);

      for (Edge edge : row){
        if (!seen.contains(edge.vertex)){

          seen.add(edge.vertex);
          toSee.add(edge.vertex);
        }
      }
      current = toSee.poll();
    }
    return seen;
  }

  List<Vertex> depth_first_search(Vertex v){
    //vars
    Vertex current = v;
    List<Vertex> seen = new ArrayList<>();
    //recursive DFS
    dfsRecursive(current, seen);
    //return List
    return seen;
  }

  void dfsRecursive(Vertex current, List<Vertex> seen){
    //grab neighbors
    List<Edge>adjList = this.adjacencyList.get(current);
    //add current node to seen
    seen.add(current);
    for (Edge e : adjList){
      Vertex v = e.getVertex();
      if (v!= null && !seen.contains(v)){
        dfsRecursive(v, seen);
      }
    }

  }

  //gets and sets
  public HashMap<Vertex, ArrayList<Edge>> getAdjacentVertices() {
    return adjacencyList;
  }
  public void setAdjacentVertices(HashMap<Vertex, ArrayList<Edge>> adjacentVertices) {
    this.adjacencyList = adjacentVertices;
  }


}


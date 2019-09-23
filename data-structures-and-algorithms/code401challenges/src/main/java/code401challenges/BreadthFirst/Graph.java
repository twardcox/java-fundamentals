package code401challenges.BreadthFirst;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<T> {

  public HashMap<Vertex<T>, ArrayList<Edge<T>>> adjacencyList;
  private int _size = 0;

  public Graph(){
    adjacencyList = new HashMap<>();
  }

  public Vertex<T> addNode(T value){
    Vertex<T> node = new Vertex<>(value);
    adjacencyList.put(node, new ArrayList<>());
    _size++;
    return node;
  }

  public void addDirectedEdge(Vertex<T> a, Vertex<T> b, int weight){

    Edge<T> edge = new Edge<>(weight, b);
    adjacencyList.get(a).add(edge);

  }

  public ArrayList<Vertex<T>> getNodes(){
    ArrayList<Vertex<T>> vertices = new ArrayList<>();

    for (Vertex<T> vertex : adjacencyList.keySet()){
      vertices.add(vertex);
    }

    return vertices;
  }

  public int getNode(String a){
    return adjacencyList.hashCode();
  }

  public ArrayList<Edge<T>> getNeighbors(Vertex<T> vertex){
    return adjacencyList.get(vertex);
  }

  public int size(){
    return this._size;
  }



}


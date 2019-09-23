package code401challenges.BreadthFirst;

public class Edge<T> {
  public int weight;
  public Vertex<T> vertex;

  public Edge(int weight, Vertex<T> vertex){
    this.weight = weight;
    this.vertex = vertex;
  }


}

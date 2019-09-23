package code401challenges.BreadthFirst;

import java.util.*;

public class BreadthFirst {
//  https://www.baeldung.com/java-graphs

//  Breadth first traversal
  static Set<Vertex> breadthFirstTraversal(Graph graph, String root){
    Set<String> visited = new LinkedHashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(root);
    visited.add(root);
    while (!queue.isEmpty()){

      String vertex = queue.poll();
      int gSize = graph.getNeighbors(vertex).size();
      ArrayList edges = graph.getNeighbors(vertex);

      for (int i = 0; i < gSize; i++){
        System.out.println(edges.get(i));
        if (!visited.contains(edges.get(i))){
          visited.add((String) edges.get(i));
          queue.add((Vertex) edges.get(i));
        }
      }
    }
    return visited;
  }

}

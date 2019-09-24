package code401challenges.BreadthFirst;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

  @Test
  public void testBreadthFirst(){
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");
    Vertex<String> v2 = graph.addNode("Alice");

    graph.addDirectedEdge(v1, v2, 8);

    System.out.println(graph.breadthFirstTraversal(v1).toString());
  }

  @Test
  public void testAddVertex_Happy() {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");

    System.out.println(graph.getNodes().get(0).value);
    assertEquals("testAddVertex_Happy is equal", "Bob", graph.getNodes().get(0).value);
  }

  @Test
  public void testAddEdge_Happy() {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");
    Vertex<String> v2 = graph.addNode("Alice");

    graph.addDirectedEdge(v1, v2, 8);

    assertEquals("testAddEdge_Happy is equal", 8, graph.getNeighbors(v1).get(0).weight);
  }

  @Test
  public void testGetAllNodes_Happy() {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");
    Vertex<String> v2 = graph.addNode("Alice");

    assertNotNull("testGetAllNodes_Happy is not null", graph.getNodes());
  }

  @Test
  public void testGetAllNeighbors_Happy() {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");
    Vertex<String> v2 = graph.addNode("Alice");

    graph.addDirectedEdge(v1, v2, 8);

    assertEquals("testGetAllNeighbors_Happy is equal", 8, graph.getNeighbors(v1).get(0).weight);
  }

  @Test
  public void testGetNeighborsWeight_Happy() {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");
    Vertex<String> v2 = graph.addNode("Alice");

    graph.addDirectedEdge(v1, v2, 8);

    assertEquals("testGetAllNeighbors_Happy is equal", 8, graph.getNeighbors(v1).get(0).weight);
  }

  @Test
  public void testGetSize_Happy() {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");
    Vertex<String> v2 = graph.addNode("Alice");


    assertEquals("testGetSize_Happy is equal", 2, graph.size());


  }

  @Test
  public void testOneVertexOneEdge_Happy() {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addNode("Bob");
    Vertex<String> v2 = graph.addNode("Alice");

    graph.addDirectedEdge(v1, v2, 8);

    assertEquals("testOneVertexOneEdge_Happy is equal", 8, graph.getNeighbors(v1).get(0).weight);
  }

  @Test
  public void testEmptyGraph_Happy() {
    Graph<String> graph = new Graph<>();


    assertEquals("testEmptyGraph_Happy is null","[]",graph.getNodes().toString());
  }


}

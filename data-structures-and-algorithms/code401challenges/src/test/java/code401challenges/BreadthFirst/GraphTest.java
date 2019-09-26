package code401challenges.BreadthFirst;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void addVertexTest() {
    Graph graph = new Graph();
    String name = "Ultron the defender";
    Vertex vfive = graph.addNode(name);

    assertTrue( graph.has(name) );
  }
  @Test
  public void addVertexTestNull() {
    Graph graph = new Graph();
    String name = "Ultron the defender";
    String fail = "Ultron";
    Vertex vone = graph.addNode(name);
    assertFalse( graph.has(fail) );
  }

  @Test
  public void addGraphEmpty() {
    Graph graph = new Graph();
    assertTrue( graph.getAdjacentVertices().isEmpty() );
  }


  @Test
  public void removeVertex() {
    Graph graph = new Graph();
    String name = "Ultron the defender";
    Vertex vfive = graph.addNode(name);

    graph.removeVertex(name);
    assertNull(graph.getAdjacentVertices().get(vfive) );
  }

  @Test
  public void addEdgeBi() {
    Graph graph = new Graph();
    String name = "Ultron the defender";

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");

    Edge e = graph.addUndirectedEdge(vone, vtwo, 3, 2);
    List<Edge> list = graph.getAdjacentVertices().get(vtwo);

    assertTrue(list.contains(e));
  }

  @Test
  public void addDirectedEdge() {
    Graph graph = new Graph();
    String name = "Ultron the defender";

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");

    Edge e = graph.addDirectedEdge(vone, vtwo, 3);

    List<Edge> list = graph.getAdjacentVertices().get(vone);

    assertTrue(list.contains(e));

  }

  @Test
  public void removeEdges() {

    Graph graph = new Graph();

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");

    Edge e = graph.addDirectedEdge(vone, vtwo, 3);

    Edge removed = graph.removeEdge(vone, vtwo);

    List<Edge> list = graph.getAdjacentVertices().get(vone);


    assertFalse(list.contains(removed));
  }

  @Test
  public void printTest() {

    Graph graph = new Graph();
    String name = "Ultron the defender";

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");

    Edge e = graph.addDirectedEdge(vone, vtwo, 3);

    List<Edge> list = graph.getAdjacentVertices().get(vone);

    String actual = graph.print(vone);

    String expected = "v: Susan from accountingw: 3";

    assertEquals(expected, actual);
  }

  @Test
  public void sizeTest() {

    Graph graph = new Graph();

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");

    Edge e = graph.addDirectedEdge(vone, vtwo, 3);

    List<Edge> list = graph.getAdjacentVertices().get(vone);

    int actual = graph.size();

    int expected = 2;

    assertEquals(expected, actual);
  }

  @Test
  public void getVertexsOfTest() {

    Graph graph = new Graph();

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");

    Edge e = graph.addDirectedEdge(vone, vtwo, 3);

    List<Edge> list = graph.getAdjacentVertsOf(vone);


    assertNotNull(list);
  }

  @Test
  public void breathFirstSearchTest() {
    Graph graph = new Graph();

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");
    Vertex vthree = graph.addNode("Rick Sanchez");
    Vertex vfour = graph.addNode("Morty Smith");
    Edge e = graph.addDirectedEdge(vone, vtwo, 3);
    Edge e2 = graph.addDirectedEdge(vtwo, vthree, 3);
    Edge e3 = graph.addDirectedEdge(vthree, vfour, 3);

    List<Vertex> list = graph.depth_first_search(vone);

    StringBuilder sb = new StringBuilder("");

    for (Vertex v : list){
      sb.append(v.getValue());
    }
    String s = sb.toString();
    String expected = "Grimley the OrthodontistSusan from accountingRick SanchezMorty Smith";

    assertEquals(s, expected);

  }

  @Test
  public void depthFirstSearchTest() {
    Graph graph = new Graph();

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");
    Vertex vthree = graph.addNode("Rick Sanchez");
    Vertex vfour = graph.addNode("Morty Smith");
    Edge e = graph.addDirectedEdge(vone, vtwo, 3);
    Edge e2 = graph.addDirectedEdge(vtwo, vthree, 3);
    Edge e3 = graph.addDirectedEdge(vthree, vfour, 3);

    List<Vertex> list = graph.depth_first_search(vone);

    StringBuilder sb = new StringBuilder("");

    for (Vertex v : list) {
      sb.append(v.getValue() + " ");
    }
    String s = sb.toString();
    String expected = "Grimley the Orthodontist Susan from accounting Rick Sanchez Morty Smith ";

    assertEquals(s, expected);
  }

  @Test
  public void depthFirstSearchTestTwo() {
    Graph graph = new Graph();

    Vertex vone = graph.addNode("Grimley the Orthodontist");
    Vertex vtwo = graph.addNode("Susan from accounting");
    Vertex vthree = graph.addNode("Rick Sanchez");
    Vertex vfour = graph.addNode("Morty Smith");
    Vertex vfive = graph.addNode("Bob");
    Vertex vsix = graph.addNode("CTHULU WHO RISES FROM THE DEEP");

    Edge e = graph.addDirectedEdge(vone, vtwo, 3);
    Edge e2 = graph.addDirectedEdge(vtwo, vthree, 3);
    Edge e3 = graph.addDirectedEdge(vthree, vfour, 3);
    Edge e4 = graph.addDirectedEdge(vthree, vfive, 3);
    Edge e5 = graph.addDirectedEdge(vfour, vsix, 3);
    Edge e6 = graph.addDirectedEdge(vone, vsix, 3);

    List<Vertex> list = graph.depth_first_search(vone);

    StringBuilder sb = new StringBuilder("");

    for (Vertex v : list) {
      sb.append(v.getValue() + " ");
    }
    String s = sb.toString();
    String expected = "Grimley the Orthodontist Susan from accounting Rick Sanchez Morty Smith CTHULU WHO RISES FROM THE DEEP Bob ";

    assertEquals(s, expected);
  }
}
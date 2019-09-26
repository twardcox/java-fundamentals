package code401challenges.GetEdge;

import code401challenges.BreadthFirst.Edge;
import code401challenges.BreadthFirst.Graph;
import code401challenges.BreadthFirst.Vertex;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetEdgeTest {

    @Test
    public void airlinesTestOne() {
        Graph graph = new Graph();

        Vertex vone = graph.addNode("Mordor");
        Vertex vtwo = graph.addNode("C317");
        Vertex vthree = graph.addNode("Soho");
        Vertex vfour = graph.addNode("Morty Smith");
        Edge e = graph.addDirectedEdge(vone, vtwo, 2);
        Edge e2 = graph.addDirectedEdge(vtwo, vthree, 3);
        Edge e3 = graph.addDirectedEdge(vthree, vfour, 4);

        List<String> list = new ArrayList<>();
        list.add("Mordor");
        list.add("C317");
        list.add("Soho");

        GetEdge getEdge = new GetEdge(graph, list);

        String actual = getEdge.airlines();

        System.out.println(actual);
    }
    @Test
    public void airlinesTestTwo() {
        Graph graph = new Graph();

        Vertex vone = graph.addNode("Mordor");
        Vertex vtwo = graph.addNode("C317");
        Vertex vthree = graph.addNode("Soho");
        Vertex vfour = graph.addNode("Morty Smith");
        Vertex vfive = graph.addNode("summer");
        Vertex vsix = graph.addNode("winter");
        Vertex vseven = graph.addNode("fall");
        Vertex veight = graph.addNode("spring");
        Edge e = graph.addDirectedEdge(vone, vtwo, 3);
        Edge e2 = graph.addDirectedEdge(vtwo, vthree, 2);
        Edge e3 = graph.addDirectedEdge(vthree, vfour, 1);
        Edge e4 = graph.addDirectedEdge(vthree, vone, 4);
        Edge e5 = graph.addDirectedEdge(vfive, vseven, 5);
        Edge e6 = graph.addDirectedEdge(veight, vsix, 6);

        List<String> list = new ArrayList<>();
        list.add("summer");
        list.add("fall");

        GetEdge getEdge = new GetEdge(graph, list);

        String actual = getEdge.airlines();

        System.out.println(actual);
    }
}
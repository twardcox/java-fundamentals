package code401challenges.GetEdge;

import code401challenges.BreadthFirst.Graph;
import code401challenges.BreadthFirst.Vertex;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void testFirstCity() {
        Graph<String> graph = new Graph<>();
        Vertex<String> v1 = graph.addNode("Bob");
        Vertex<String> v2 = graph.addNode("Alice");
        ArrayList cities = new ArrayList() {
        };
        cities.add("Bob");
        cities.add("Alice");

        graph.addDirectedEdge(v1, v2, 8);

        System.out.println(GetEdge.GetEdge(graph, cities));
    }
}
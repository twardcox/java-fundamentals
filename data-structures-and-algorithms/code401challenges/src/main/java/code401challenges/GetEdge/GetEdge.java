package code401challenges.GetEdge;

import code401challenges.BreadthFirst.Edge;
import code401challenges.BreadthFirst.Graph;
import code401challenges.BreadthFirst.Vertex;

import java.util.*;

public class GetEdge {

  List<Vertex> search;
  List<String> cities;
  Vertex first;
  Graph graph;
  //constructor
  public GetEdge(Graph graph, List<String> list){
    this.graph = graph;
    this.cities = list;
  }

  public String airlines(){
    int price = 0;
    for (int i = 0 ; i < cities.size() ; i ++ ){
      Vertex city = translateStringToVertex(cities.get(i));
      System.out.println("landing at: " + city.getValue());

      //if its the last city, break out.
      if (cities.indexOf(cities.get(i)) == cities.size()-1) break;

      //if we can't get an adjacent list of edges, false.
      if (graph.adjacencyList.get(city) == null) return "false, 0";

      //grab edges of current city
      ArrayList<Edge> edges = (ArrayList<Edge>) graph.adjacencyList.get(city);

      // for each edge
      for (Edge connection : edges){
        Vertex connectionCity = connection.getVertex();
        System.out.println("connectionCity name: "+ connection.getVertex().getValue());
        System.out.println("connectionCity weight: "+ connection.getWeight());

        int connectionPrice = connection.getWeight();
        System.out.println();

        //if the name of the city (in cities) matches the city (in the adj list)
        if ( connectionCity.getValue().equals(cities.get(i+1)) ){

          //add to price
          price = price + connectionPrice;
          System.out.println("adding price: " + price + " for this city: " + connectionCity.getValue());
        }
        else {

          System.out.println("did not add price.");
        }
      }
    }
    return "true, " + price;
  }


  private Vertex translateStringToVertex(String s){
    Vertex city = null;

    //for all the vertexes in the graph
    for (Vertex v : graph.adjacencyList.keySet()) {

      String value = v.getValue();


      //if list has the value of the vertex,
      if (s.equals(value) ) {

        //add to search
        city = v;
      }
    }
    return city;
  }
}
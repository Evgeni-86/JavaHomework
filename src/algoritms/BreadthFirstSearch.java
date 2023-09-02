//ПОИСК В ШИРИНУ

package algoritms;

import java.util.*;

public class BreadthFirstSearch {
    public static void main(String[] args) {

        Edge a_edge = new Edge("A");
        Edge b_edge = new Edge("B");
        Edge start_edge = new Edge("Start");
        Edge end_edge = new Edge("End");


        Graph graph = new Graph();

        graph.addVertex(start_edge);
        graph.addEdge(start_edge, a_edge, 6);
        graph.addEdge(start_edge, b_edge, 2);

        graph.addVertex(a_edge);
        graph.addEdge(a_edge, end_edge, 1);

        graph.addVertex(b_edge);
        graph.addEdge(b_edge, a_edge, 3);
        graph.addEdge(b_edge, end_edge, 5);

        graph.addVertex(end_edge);


        System.out.println(graph.getGraphs().get(a_edge));

//        System.out.println(graph.getGraphs());

    }

    public static void findRoad(Graph start, Graph end) {

        LinkedList<Graph> stack = new LinkedList<>();
        stack.add(start);


    }

}

class Graph {

    private final HashMap<Edge, List<Edge>> graphs = new HashMap<>();

    public void addVertex(Edge vertex) {
        graphs.put(vertex, new ArrayList<>());
    }

    public void addEdge(Edge parent, Edge edge, int weight) {
        if (graphs.containsKey(parent)) {
            edge.setParent(parent);
            edge.setWeight(weight);
            graphs.get(parent).add(edge);
        }
    }

    public HashMap<Edge, List<Edge>> getGraphs() {
        return graphs;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "graphs=" + graphs +
                '}';
    }
}

class Edge {

    private final String name;
    private Edge parent;
    private int weight;

    public Edge(String name) {
        this.name = name;
    }

    public void setParent(Edge parent) {
        this.parent = parent;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(name, edge.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Edge{" +
                "name='" + name + '\'' +
                ", parent=" + parent +
                ", weight=" + weight +
                '}';
    }
}

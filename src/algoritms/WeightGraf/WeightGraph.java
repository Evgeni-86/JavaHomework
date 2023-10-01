package algoritms.WeightGraf;

import java.util.*;

public class WeightGraph {
    public static void main(String[] args) {
        Vertex vertex_Start = new Vertex("Книга");
        Vertex vertex_End = new Vertex("Пианино");
        Vertex vertex_A = new Vertex("Редкая пластинка");
        Vertex vertex_B = new Vertex("Постер");
        Vertex vertex_C = new Vertex("Бас-гитара");
        Vertex vertex_D = new Vertex("Барабан");

        vertex_Start.addEdge(vertex_A, 5);
        vertex_Start.addEdge(vertex_B, 0);

        vertex_A.addEdge(vertex_C, 15);
        vertex_A.addEdge(vertex_D, 20);

        vertex_B.addEdge(vertex_C, 30);
        vertex_B.addEdge(vertex_D, 35);

        vertex_C.addEdge(vertex_End,20);
        vertex_D.addEdge(vertex_End,10);

        test(vertex_Start, vertex_End);
    }

    public static void test(Vertex start, Vertex end) {
        HashMap<Vertex, Vertex> VertexParent = new HashMap<>();
        HashMap<Vertex, Integer> VertexCosts = new HashMap<>();
        HashSet<Vertex> checked = new HashSet<>();

        LinkedList<Vertex> stack = new LinkedList<>();
        stack.add(start);
        VertexCosts.put(start, 0);

        while (stack.size() > 0) {
            Vertex currentVertex = stack.removeFirst();
            if (checked.contains(currentVertex)) {
                continue;
            }
            checked.add(currentVertex);

            TreeSet<Edge> currentVertexEdges = currentVertex.getEdges();
            for (Edge edge : currentVertexEdges) {
                int currentEdgeDestinationCosts = VertexCosts.get(currentVertex) + edge.getWeight();

                if (VertexCosts.containsKey(edge.getDestination())) {
                    int currentCostsEdgeInMemory = VertexCosts.get(edge.getDestination());
                    if (currentEdgeDestinationCosts < currentCostsEdgeInMemory) {
                        VertexCosts.put(edge.getDestination(), currentEdgeDestinationCosts);
                        VertexParent.put(edge.getDestination(), currentVertex);
                    }
                } else {
                    VertexCosts.put(edge.getDestination(), currentEdgeDestinationCosts);
                    VertexParent.put(edge.getDestination(), currentVertex);
                }
                stack.add(edge.getDestination());
            }

        }
        System.out.println("---RESULT---------");
        System.out.println(VertexCosts.get(end));
        System.out.println("------------------");
        while (end != null){
            System.out.println(end.getName());
            end = VertexParent.get(end);
        }
    }



}

//----------------------------------
class Vertex {
    private final String name;
    private final TreeSet<Edge> edges = new TreeSet<>();

    public Vertex(String name) {
        this.name = name;
    }

    public TreeSet<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Vertex edge, int weight) {
        Edge newEdge = new Edge(edge, weight);
        edges.add(newEdge);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", edges=" + edges +
                '}';
    }
}

class Edge implements Comparable<Edge> {
    private final Vertex destination;
    private final int weight;

    public Edge(Vertex destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getDestination() {
        return destination;
    }

    @Override
    public int compareTo(Edge o) {
        if ((this.weight - o.weight) == 0) {
            return this.destination.getName().compareTo(o.destination.getName());
        }
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "destination=" + destination.getName() +
                ", weight=" + weight +
                '}';
    }
}

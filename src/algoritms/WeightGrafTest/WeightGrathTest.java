package algoritms.WeightGrafTest;

/*
 * 1) Таблица для сохранения пути в виде Parent Child
 * 2) Сущьность которая будет хранить просмотренные вершины
 * 2) Обьект типа Vertex - вершина
 * 3) Обьект типа Edge - ребро (стоимость перехода до другой вершины), должны быть отсортированы по цене прехода
 *
 * */


import java.util.*;


public class WeightGrathTest {

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

        vertex_C.addEdge(vertex_End, 20);
        vertex_D.addEdge(vertex_End, 10);

        testMethod(vertex_Start, vertex_End);
    }

    public static void testMethod(Vertex start, Vertex end) {

        Map<Vertex, Vertex> childParent = new HashMap<>();
        Set<Vertex> checkedVertex = new HashSet<>();

        Deque<Vertex> stack = new LinkedList<>();
        start.currentPrice = 0;
        stack.add(start);

        while (stack.size() > 0) {
            Vertex currenVertex = stack.removeFirst();
            if (checkedVertex.contains(currenVertex)) {
                continue;
            }

            for (Edge currentEdgeCurrentVertex : currenVertex.edgeList) {

                Vertex destinationVertex = currentEdgeCurrentVertex.destination;
                int sumCurrentPriceAndPriceTransition = currenVertex.currentPrice + currentEdgeCurrentVertex.priceTransition;

                if (destinationVertex.currentPrice != null) {
                    if (sumCurrentPriceAndPriceTransition <  destinationVertex.currentPrice ){
                        destinationVertex.currentPrice = sumCurrentPriceAndPriceTransition;
                        childParent.put(destinationVertex, currenVertex);
                    }
                } else {
                    destinationVertex.currentPrice = sumCurrentPriceAndPriceTransition;
                    childParent.put(destinationVertex, currenVertex);
                }
                stack.add(destinationVertex);
            }

            checkedVertex.add(currenVertex);
        }

        System.out.println(end.currentPrice);
        System.out.println("-------------------");
        while (end != null){
            System.out.println(end.name);
            end = childParent.get(end);
        }

    }

}

class Vertex {
    String name;
    Set<Edge> edgeList = new TreeSet<>();
    Integer currentPrice = null;

    public Vertex(String name) {
        this.name = name;
    }

    public void addEdge(Vertex vertex, int price) {
        this.edgeList.add(new Edge(vertex, price));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(name, vertex.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", edgeList=" + edgeList +
                ", currentPrice=" + currentPrice +
                '}';
    }
}

class Edge implements Comparable<Edge> {
    Vertex destination;
    int priceTransition;

    public Edge(Vertex destination, int price) {
        this.destination = destination;
        this.priceTransition = price;
    }

    @Override
    public int compareTo(Edge o) {
        return this.priceTransition - o.priceTransition;
    }
}

package com.howtocrack.coding.interview;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class GraphLearn {
    public static void main(String[] args) {
        Map<Graph, List<Graph>> adjList = new HashMap<>();
         Graph zero =  new Graph("0");
        Graph one =  new Graph("1");
        Graph two =  new Graph("2");
        Graph three =  new Graph("3");
        Graph four =  new Graph("4");
        Graph five =  new Graph("5");
        Graph six =  new Graph("6");
        adjList.put(new Graph("0"), Arrays.asList(one));
        adjList.put(new Graph("1"), Arrays.asList(two));
        adjList.put(new Graph("2"), Arrays.asList(zero,three));
        adjList.put(new Graph("3"),Arrays.asList(two));
        adjList.put(new Graph("4"),Arrays.asList(six));
        adjList.put(new Graph("5"),Arrays.asList(four));
        adjList.put(new Graph("6"),Arrays.asList(five));
        new GraphLearn().BFSTraversal(two,adjList);



    }

    public void BFSTraversal(Graph graph, Map<Graph, List<Graph>> adjList){
        Queue<String> queue = new LinkedList<>();
        Set<String>  visited = new LinkedHashSet<>();
        visited.add(graph.getName());
        queue.add(graph.getName());

        while (!queue.isEmpty()){
            String x = queue.poll();
            for(Graph g : getAdjcents(x,adjList))
            if(!visited.contains(g.getName())){
                queue.add(g.getName());
                visited.add(g.getName());
            }
        }
        System.out.println(visited);

    }

    private List<Graph> getAdjcents(String name, Map<Graph, List<Graph>> adjList) {

        List<Graph> list = adjList.get(new Graph(name));
        return list;

    }

}

@Setter
@Getter
class Graph{

   public  String name;
   public Graph(String name){this.name  = name;}

    @Override
    public boolean equals(Object obj) {
       Graph g = (Graph) obj;
        return name.equals(g.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
package graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Prims {


    class Pair {
        int src;
        int des;
        int weight;
    }

    static int spanningTree(int V, ArrayList<ArrayList<Pair>> adj)
    {
        boolean[] isVisited = new boolean[V];

        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>() {
        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.weight - o2.weight;
        }
    });

        minHeap.addAll(adj.get(0));
        isVisited[0] = true;
        int minWeight = 0;

        int edgeCount = 0;

        while (!minHeap.isEmpty() && edgeCount < V-1){
            Pair edge = minHeap.remove();

            if(!isVisited[edge.des]) {
                minWeight += edge.weight;
                edgeCount++;
            }

            isVisited[edge.des] = true;
            for(Pair newEdge: adj.get(edge.des)) {
                if(!isVisited[newEdge.des]) {
                    minHeap.add(newEdge);
                }
            }
        }

        return minWeight;

    }

}

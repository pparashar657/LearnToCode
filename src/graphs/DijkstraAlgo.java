package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DijkstraAlgo {

    class Edge {
        int dest;
        int weight;
        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public ArrayList<Edge>[] createGraph(int[][] times, int n) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] edge: times) {
            int src = edge[0];
            int dest = edge[1];
            int weight = edge[2];
            graph[src-1].add(new Edge(dest-1, weight));
        }

        return graph;
    }

    public int[] helper(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[graph.length];

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i< dist.length; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] =0;

        queue.add(src);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            int currDist = dist[curr];
            for(Edge ed : graph[curr]){
                if(currDist + ed.weight < dist[ed.dest]){
                    dist[ed.dest] = currDist + ed.weight;
                    if (!queue.contains(ed.dest)) {
                        queue.add(ed.dest);
                    }
                }
            }
        }
        return dist;
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge>[] graph = createGraph(times, n);

        int[] shortestPathArr = helper(graph, k-1);

        int ans = Integer.MIN_VALUE;
        for(int temp: shortestPathArr) {
            ans = Math.max(ans, temp);
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
package graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kruskals {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int[][] edges = new int[e][3];
        for (int i = 0; i < e; i++) {
            String[] st = br.readLine().split(" ");
            edges[i][0] = Integer.parseInt(st[0]);
            edges[i][1] = Integer.parseInt(st[1]);
            edges[i][2] = Integer.parseInt(st[2]);
        }

        System.out.println(minCostToSupplyWater(v, edges));
    }

    static int[] parent;
    static int[] rank;

    public static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int wt;

        Pair(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair o) {
            return this.wt - o.wt;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "u=" + u +
                    ", v=" + v +
                    ", wt=" + wt +
                    '}';
        }
    }

    public static int findParent(int vertex) {
        if(parent[vertex] == vertex) {
            return vertex;
        }
        return findParent(parent[vertex]);
    }

    public static boolean isCycle(Pair edge) {
        int srcParent = findParent(edge.u);
        int desParent = findParent(edge.v);

        parent[edge.u] = srcParent;
        parent[edge.v] = desParent;

        if (srcParent == desParent) {
            return true;
        }

        if (rank[srcParent] > rank[desParent]) {
            parent[desParent] = srcParent;
        } else if (rank[srcParent] < rank[desParent]) {
            parent[srcParent] = desParent;
        } else {
            parent[srcParent] = desParent;
            rank[desParent]++;
        }

        return false;

    }

    public static int minCostToSupplyWater(int n, int[][] pipes) {

        List<Pair> edges = new ArrayList<>();

        for(int[] edge: pipes) {
            Pair newEdge = new Pair(edge[0], edge[1], edge[2]);
            edges.add(newEdge);
        }

        Collections.sort(edges);

        parent = new int[n];
        rank = new int[n];

        for (int i=0;i<n;i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        int minWeight = 0;
        int edgeCount = 0;

        for(Pair edge: edges) {
            if(!isCycle(edge)) {
                minWeight += edge.wt;
                edgeCount++;
                if(edgeCount == n-1)
                    break;
            }
        }
        return minWeight;
    }

}

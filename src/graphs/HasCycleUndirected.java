package graphs;

import java.io.*;
import java.util.*;

public class HasCycleUndirected {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static boolean checkCycle(ArrayList<Edge>[] graph, boolean[] isVisited, int curr, int parent) {
        if(isVisited[curr])
            return true;

        isVisited[curr] = true;

        for(Edge ed : graph[curr]){
            if(parent != ed.nbr && checkCycle(graph, isVisited, ed.nbr, curr)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        boolean[] isVisited = new boolean[vtces];

        boolean isCycle = false;

        for(int i=0;i<vtces;i++) {
            if(!isVisited[i]) {
                if(checkCycle(graph, isVisited, i, -1)) {
                    isCycle = true;
                    break;
                }
            }
        }

        if(isCycle) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
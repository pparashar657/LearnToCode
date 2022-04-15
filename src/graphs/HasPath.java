package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HasPath {

    public void dfs(LinkedList<Integer>[] matrix, boolean[] isVisited, int curr) {

        if(isVisited[curr]) {
            return;
        }

        isVisited[curr] = true;

        if( matrix[curr] == null) {
            return;
        }

        for(int i=0; i< matrix[curr].size() ;i++ ) {
            dfs(matrix, isVisited, matrix[curr].get(i));
        }
    }

    public LinkedList<Integer>[] makeMatrix(int[][] edges, int n) {
        LinkedList<Integer>[] graph = new LinkedList[n];

        for(int i=0; i< edges.length; i++){
            int src = edges[i][0];
            int des = edges[i][1];

            if(graph[src] != null) {
                graph[src].add(des);
            } else {
                graph[src] = new LinkedList<>();
                graph[src].add(des);
            }

            if(graph[des] != null) {
                graph[des].add(src);
            } else {
                graph[des] = new LinkedList<>();
                graph[des].add(src);
            }
        }
        return graph;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] isVisited = new boolean[n];

        LinkedList<Integer>[] matrix = makeMatrix(edges, n);

        dfs(matrix, isVisited, source);

        return isVisited[destination];

    }

    public static void main(String[] args) {
        List<Integer> path = new ArrayList<>();
        path.add(1);
        path.add(2);

        List<Integer> myPath = new ArrayList<>(path);

        System.out.println(myPath);

        path.add(3);
        System.out.println(myPath);


    }

}

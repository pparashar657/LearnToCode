package graphs;

import java.util.Stack;

public class DFS {

    public static void dfs(int[][] edges, int currVertex, int[] isVisited) {
        isVisited[currVertex] = 1;
        System.out.print(currVertex +" ");
        for(int i=0;i<edges.length;i++) {
            if(edges[currVertex][i] != 0 && isVisited[i] == 0) {
                dfs(edges, i, isVisited);
            }
        }
    }

    public static void dfs2(int[][] edges,  int currVertex, int[] isVisited) {
        Stack<Integer> stack = new Stack<>();
        stack.add(currVertex);
        isVisited[currVertex] = 1;
        while(!stack.isEmpty()) {
            int curr = stack.pop();
            System.out.print(curr +" ");
            for(int i=0;i<edges[curr].length; i++) {
                if(edges[curr][i] == 1 && isVisited[i] == 0) {
                    stack.add(i);
                    isVisited[i] = 1;
                }
            }
        }
        for(int i=0;i<isVisited.length;i++) {
            if(isVisited[i] != 1) {
                dfs2(edges, i, isVisited);
            }
        }

    }

    public static void main(String[] args) {
        int[][] edges = GraphDemo.constructAdjacencyMatrix();
        int[] isVisited = new int[edges.length];
//        dfs(edges, 0, isVisited);
        for(int i=0;i<edges.length;i++) {
            if(isVisited[i] == 0) {
                dfs(edges, i, isVisited);
            }
        }
    }

}

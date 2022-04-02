package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        int[][] edges = GraphDemo.constructAdjacencyMatrix();

        bfs(edges);

    }

    private static void bfs(int[][] edges) {
        int[] isVisited = new int[edges.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int ele = queue.remove();
            System.out.print(ele +" ");
            for(int i=0; i< edges.length;i++){
                if(edges[ele][i] != 0 && isVisited[i] !=1){
                    queue.add(i);
                    isVisited[i] =1;
                }
            }
        }
    }

}

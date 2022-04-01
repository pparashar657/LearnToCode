package graphs;

import java.util.*;

public class GraphDemo {

    public static int[][] constructAdjacencyMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertex");
        int ver = sc.nextInt();
        System.out.println("Enter edges");
        int edges = sc.nextInt();

        System.out.println("Enter the source and dest of edges: ");
        int[][] mat = new int[ver][ver];
        for(int i=0; i< edges; i++){
            int src = sc.nextInt();
            int des = sc.nextInt();
            mat[src][des] = 1;
        }
        return mat;
    }

    public static LinkedList<Integer>[] constructAdjacencyList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertex");
        int ver = sc.nextInt();
        System.out.println("Enter edges");
        int edges = sc.nextInt();

        System.out.println("Enter the source and dest of edges: ");

        LinkedList<Integer>[] graph = new LinkedList[ver];

        for(int i=0; i< edges; i++){
            int src = sc.nextInt();
            int des = sc.nextInt();

            if(graph[src] != null) {
                graph[src].add(des);
            } else {
                graph[src] = new LinkedList<>();
                graph[src].add(des);
            }
        }
        return graph;
    }

    public static void print(int[][] edges) {
        for (int i=0;i<edges.length; i++) {
            System.out.print(i+" : ");
            for(int j=0;j<edges[i].length;j++) {
                if(edges[i][j] != 0) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    public static void print(LinkedList<Integer>[] edges) {
        for (int i=0;i<edges.length; i++) {
            System.out.print(i+" : ");
            System.out.println(edges[i]);
        }
    }

    public static void main(String[] args) {
//        int[][] edges = constructAdjacencyMatrix();
//        for (int[] arr: edges) {
//            System.out.println(Arrays.toString(arr));
//        }

//        print(edges);
        LinkedList<Integer>[] graph = constructAdjacencyList();
        print(graph);
    }

}

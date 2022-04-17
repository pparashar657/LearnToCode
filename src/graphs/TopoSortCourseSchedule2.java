package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortCourseSchedule2 {

    ArrayList<Integer>[] createGraph(int[][] pre, int n) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int[] edge: pre) {
            int src = edge[1];
            int des = edge[0];
            if(graph[src] != null) {
                graph[src].add(des);
            } else {
                graph[src] = new ArrayList<>();
                graph[src].add(des);
            }
        }

        return graph;
    }

    int[] topoSort(int V, ArrayList<Integer>[] adj)
    {
        Stack<Integer> st = new Stack<>();

        if(!canFinish(V, adj, st)) {
            return new int[0];
        }

        int[] ans = new int[V];
        int temp =0;
        while(!st.isEmpty()){
            ans[temp] = st.pop();
            temp++;
        }
        return ans;

    }


    boolean checkCycle(ArrayList<Integer>[] graph, boolean[] isVisited, boolean[] pathVisited, int curr, Stack<Integer> st) {
        if(isVisited[curr] && pathVisited[curr]) {
            return true;
        } else if(isVisited[curr]) return false;


        isVisited[curr] = true;
        pathVisited[curr] = true;

        if(graph[curr] != null) {
            for(int next: graph[curr]) {
                if(checkCycle(graph, isVisited, pathVisited, next, st)) {
                    return true;
                }
            }
        }

        st.push(curr);
        pathVisited[curr] = false;

        return false;
    }

    public boolean canFinish(int numCourses, ArrayList<Integer>[] graph, Stack<Integer> st) {
        boolean[] isVisited = new boolean[numCourses];

        boolean[] pathVisited = new boolean[numCourses];

        for(int i=0; i< numCourses; i++) {
            if(!isVisited[i]) {
                if(checkCycle(graph, isVisited, pathVisited, i, st)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        return topoSort(numCourses, createGraph(prerequisites, numCourses));
    }

}

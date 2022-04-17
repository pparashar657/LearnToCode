package graphs;

import java.util.ArrayList;

public class CycleDetectionCourseSchedule {

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

    boolean checkCycle(ArrayList<Integer>[] graph, boolean[] isVisited, boolean[] pathVisited, int curr) {
        if(isVisited[curr] && pathVisited[curr]) {
            return true;
        } else if(isVisited[curr]) return false;


        if(graph[curr] == null) return false;

        isVisited[curr] = true;
        pathVisited[curr] = true;

        for(int next: graph[curr]) {
            if(checkCycle(graph, isVisited, pathVisited, next)) {
                return true;
            }
        }

        pathVisited[curr] = false;

        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = createGraph(prerequisites, numCourses);

        boolean[] isVisited = new boolean[numCourses];

        boolean[] pathVisited = new boolean[numCourses];

        for(int i=0; i< numCourses; i++) {
            if(!isVisited[i]) {
                if(checkCycle(graph, isVisited, pathVisited, i)) {
                    return false;
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.set(0, 16);
        return true;

    }

}

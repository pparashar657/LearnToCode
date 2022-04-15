package graphs;

import java.util.ArrayList;
import java.util.List;

public class AllPaths {

    List<List<Integer>> ans;

    public void dfs(int[][] graph, boolean[] isVisited, List<Integer> path, int curr) {

        if(isVisited[curr]) return;

        isVisited[curr] = true;

        path.add(curr);

        if(curr == graph.length-1) {
            List<Integer> myPath = new ArrayList<>(path);
            ans.add(myPath);
        }

        for(int i=0;i<graph[curr].length;i++) {
            dfs(graph, isVisited, path, graph[curr][i]);
        }

        isVisited[curr] = false;
        path.remove(path.size()-1);

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        ans = new ArrayList<>();

        boolean[] isVisited = new boolean[graph.length];
        List<Integer> path = new ArrayList<>();
        dfs(graph, isVisited, path, 0);
        return ans;
    }

}

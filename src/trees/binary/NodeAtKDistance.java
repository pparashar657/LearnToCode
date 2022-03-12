package trees.binary;

import java.util.*;

public class NodeAtKDistance {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
  }

    class Pair {
        TreeNode parent;
        boolean direction; // True-Left | False-Right

        Pair(TreeNode parent, boolean direction) {
            this.parent = parent;
            this.direction = direction;
        }
    }

    Map<TreeNode, Pair> map;

    public void constructAncestorMap(TreeNode root, TreeNode parent, boolean direction){

        if(root == null) {
            return;
        }

        map.put(root, new Pair(parent, direction));

        constructAncestorMap(root.left, root, true);
        constructAncestorMap(root.right, root, false);
    }

    public void addChildAtK(TreeNode root, int level, List<Integer> ans, int k) {
        if(root == null) {
            return;
        }
        if(level == k) {
            ans.add(root.val);
            return;
        }
        addChildAtK(root.left, level+1, ans, k);
        addChildAtK(root.right, level+1, ans, k);
    }

    public void enrichOtherNodes(TreeNode target, List<Integer> ans, int k) {
        int tempK = k;
        TreeNode curr = target;
        while(curr != null && tempK-- > 0) {
            Pair parentPair = map.get(curr);

            if(parentPair.parent == null) return;

            if(tempK == 0) {
                ans.add(parentPair.parent.val);
                break;
            }

            if(parentPair.direction) {
                addChildAtK(parentPair.parent.right, 1, ans, tempK);
            } else {
                addChildAtK(parentPair.parent.left, 1, ans, tempK);
            }
            curr = parentPair.parent;
        }
    }

    public List<Integer> distanceK2(TreeNode root, TreeNode target, int K) {
        map = new HashMap<>();
        constructAncestorMap(root, null, true);
        List<Integer> ans = new ArrayList<>();

        addChildAtK(target, 0, ans, K);

        enrichOtherNodes(target, ans, K);

        return ans;

    }

    Map<TreeNode, TreeNode> map2;
    List<Integer> ans;
    Set<TreeNode> isVisited;

    public void constructAncestorMap(TreeNode root, TreeNode parent){

        if(root == null) {
            return;
        }

        map2.put(root, parent);

        constructAncestorMap(root.left, root);
        constructAncestorMap(root.right, root);
    }

    public void helper(TreeNode currNode, int dist, int k) {
        if(currNode == null || dist > k || isVisited.contains(currNode)) {
            return;
        }
        isVisited.add(currNode);
        if(dist == k) {
            ans.add(currNode.val);
        }

        helper(currNode.left, dist+1, k);
        helper(currNode.right, dist+1, k);
        helper(map2.get(currNode), dist+1, k);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        map2 = new HashMap<>();
        constructAncestorMap(root, null);
        ans = new ArrayList<>();
        isVisited = new HashSet<>();
        helper(target, 0, K);
        return ans;
    }

}

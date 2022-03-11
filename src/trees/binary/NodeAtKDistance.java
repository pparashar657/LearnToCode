package trees.binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        map = new HashMap<>();
        constructAncestorMap(root, null, true);
        List<Integer> ans = new ArrayList<>();

        addChildAtK(target, 0, ans, K);

        enrichOtherNodes(target, ans, K);

        return ans;

    }

}

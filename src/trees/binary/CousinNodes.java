package trees.binary;

import java.util.ArrayList;
import java.util.List;

public class CousinNodes {

    private static void getNodesAtLevel(Node currNode, int target, int targetLevel, int currLevel, List<Integer> ans) {

        if(currNode == null || currLevel > targetLevel) return;

        if(targetLevel == currLevel+1) {
            Node left = currNode.left;
            Node right = currNode.right;

            if((left != null && left.data == target) || (right != null && right.data == target)) {
                return;
            } else {
                if(left != null) ans.add(left.data);
                if(right != null) ans.add(right.data);
            }
        }

        getNodesAtLevel(currNode.left,target, targetLevel, currLevel+1, ans);
        getNodesAtLevel(currNode.right,target, targetLevel, currLevel+1, ans);
    }

    private static void getNodesAtLevel2(Node currNode, int targetLevel, int currLevel, List<Integer> ans) {

        if(currNode == null || currLevel > targetLevel) return;

        if(targetLevel == currLevel) {
            ans.add(currNode.data);
        }

        getNodesAtLevel2(currNode.left, targetLevel, currLevel+1, ans);
        getNodesAtLevel2(currNode.right, targetLevel, currLevel+1, ans);
    }

    static Node targetParent;

    private static int getLevel(Node root, int target, int curLevel, Node myParent) {

        if(root == null) {
            return -1;
        }

        if(target == root.data) {
            targetParent = myParent;
            return curLevel;
        }

       int l = getLevel(root.left, target, curLevel+1, root);
       int r = getLevel(root.right, target, curLevel+1, root);
       if(l == -1 && r != -1) {
           return r;
       } else {
           return l;
       }
    }

    private static List<Integer> getCousins(Node root, int target) {

        int targetLevel = getLevel(root, target, 0, null);
        List<Integer> ans = new ArrayList<>();
        getNodesAtLevel2(root, targetLevel, 0, ans);
        if(targetParent.left != null) ans.remove(ans.indexOf(targetParent.left.data));
        if(targetParent.right != null) ans.remove(ans.indexOf(targetParent.right.data));
        return ans;
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,-1,7,-1,-1,8,9};
        Node root = BinaryTree.create(data, 0);

        System.out.println(getCousins(root, 5));

    }

}

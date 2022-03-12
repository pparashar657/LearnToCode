package trees.bst;

import trees.binary.BinaryTree;
import trees.binary.Node;

import java.util.Arrays;

public class BST {

    private static Node helper(int[] arr, int start, int end) {

        if(start > end) return null;

        int mid = (start+end)>>1;
        Node root = new Node(arr[mid]);
        root.left = helper(arr, start, mid-1);
        root.right = helper(arr, mid+1, end);
        return root;
    }

    public static Node create(int[] arr) {
        Arrays.sort(arr);
        return helper(arr, 0, arr.length-1);
    }

    public static boolean checkBST(Node root) {
        if(root == null) return true;

        Node leftMax = root.left;
        Node rightMin = root.right;

        while(leftMax != null && leftMax.right != null) {
            leftMax = leftMax.right;
        }
        while(rightMin != null && rightMin.left != null) {
            rightMin = rightMin.left;
        }

        if((leftMax!= null && (leftMax.data > root.data)) || (rightMin!=null) && (rightMin.data < root.data)) {
            return false;
        }

        return checkBST(root.left) && checkBST(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {7,2,6,9,1,3,8,4,5};
        Node root = create(arr);
        BinaryTree.levelOrder(root);
        System.out.println(checkBST(root));
    }

}

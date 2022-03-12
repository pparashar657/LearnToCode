package trees.binary;

import java.util.*;

public class BinaryTree {

    public static Node create(int[] data, int idx) {

        if(idx >= data.length || data[idx] == -1) {
            return null;
        }
        Node myNode = new Node(data[idx]);

        myNode.left = create(data, 2*idx+1);
        myNode.right = create(data, 2*idx+2);
        return myNode;
    }

    public static void levelOrder1(Node root, int level, HashMap<Integer, List<Integer>> map) {
        if(root == null) {
            return;
        }
        if(map.containsKey(level)) {
            map.get(level).add(root.data);
        } else {
            List<Integer> myList = new ArrayList<>();
            myList.add(root.data);
            map.put(level,myList);
        }
        levelOrder1(root.left, level+1, map);
        levelOrder1(root.right, level+1, map);
    }

    public static void levelOrder2(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int count = queue.size();
            while(count-- > 0) {
                Node currNode = queue.remove();
                System.out.print(currNode.data +" ");
                if(currNode.left != null) queue.add(currNode.left);
                if(currNode.right != null) queue.add(currNode.right);
            }
            System.out.println();
        }
    }

    public static void levelOrder(Node root) {
//        HashMap<Integer, List<Integer>> myMap = new HashMap<>();
//        levelOrder1(root, 0, myMap);
//        int level = 0;
//        while(myMap.containsKey(level)) {
//            System.out.println(myMap.get(level));
//            level++;
//        }

        levelOrder2(root);

    }

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    public static void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static int height(Node root) {
        return 0;
    }

    public static boolean isBalanced(Node root) {
        return true;
    }

    public static int getLevel(Node root, int data) {
        return 0;
    }

    public static boolean search(Node root, int data) {
        return true;
    }

    public static void main(String[] args) {
//        int[] data = {1,2,3,4,5,6,7,-1,-1,8,9};
//        Node root = create(data, 0);
////        preOrder(root);
////        postOrder(root);
////        inOrder(root);
//        levelOrder(root);
//        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(-1,20);
        map.put(4,40);
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);
        keys.add(1);


    }
}

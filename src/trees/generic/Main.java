package trees.generic;

import java.util.*;

public class Main {

    private static int childIndex;

    public static GenericNode create(int[] nodes) {
         return helper(nodes, 0);
    }

    private static GenericNode helper(int[] nodes, int start) {
        childIndex = start + 2;
        GenericNode root = new GenericNode(nodes[start]);
        for (int count = 0 ; count < nodes[start+1]; count++) {
            root.children.add(helper(nodes, childIndex));
        }
        return root;
    }

    public static void preOrder(GenericNode root) {
        System.out.print(root.data +" ");
        for (int i=0;i<root.children.size(); i++) {
           preOrder(root.children.get(i));
        }
    }

    public static void postOrder(GenericNode root) {
        for (int i=0;i<root.children.size(); i++) {
            postOrder(root.children.get(i));
        }
        System.out.print(root.data +" ");
    }

    public static void print(GenericNode root) {

        if(root.children.isEmpty()) {
            return;
        }

        System.out.print(root.data +" -> ");
        for (int i=0;i<root.children.size(); i++) {
            System.out.print(root.children.get(i).data +" ");
        }
        System.out.println();
        for (int i=0;i<root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static int getMax(GenericNode root) {
        int max = root.data;
        for(GenericNode node: root.children){
            int currMax = getMax(node);
            if(currMax > max){
                max = currMax;
            }
        }
        return max;
    }

    public static int getLeafCount(GenericNode root) {
        if(root.children.isEmpty()) {
            return 1;
        }
        int ans = 0;

        for(GenericNode child: root.children) {
            ans += getLeafCount(child);
        }
        return ans;
    }
    public static void printAllPath(GenericNode root, List<Integer> path){
        List<Integer> newPath = new ArrayList<>(path);
        newPath.add(root.data);
        if(root.children.isEmpty()) {
            System.out.println(newPath);
//            path.remove(path.size()-1);
            return;
        }
        for(GenericNode child: root.children) {
            printAllPath(child, newPath);
        }
//        path.remove(path.size()-1);
    }

    public static List<List<Integer>> getAllPaths(GenericNode root) {
        return null;
    }

    public static List<Integer> getPath(GenericNode root, int data) {

        if(root.data == data) {
            List<Integer> ans = new ArrayList<>();
            ans.add(data);
            return ans;
        }

        if(root.children.isEmpty()) {
            return null;
        }

        for(GenericNode child: root.children) {
            List<Integer> smallAns = getPath(child, data);
            if (smallAns != null) {
                smallAns.add(0, root.data);
                return smallAns;
            }
        }
        return null;
    }

    public static boolean search(GenericNode root, int target) {
        if(root.data == target) {
            return true;
        }
        for(GenericNode node: root.children) {
            if(search(node,target)) {
                return true;
            }
        }
        return false;
    }

    public static int getLevel(GenericNode root, int target, int level) {

        if(root.data == target) {
            return level;
        }

        for(GenericNode child: root.children) {
            int currAns = getLevel(child, target, level+1);
            if(currAns != -1) {
                return currAns;
            }
        }
        return -1;
    }

    public static int replaceNodeWithLeafCount(GenericNode root) {
        if(root.children.isEmpty()) {
            root.data = 0;
            return 1;
        }
        int ans = 0;
        for(GenericNode child: root.children) {
            ans += replaceNodeWithLeafCount(child);
        }
        root.data = ans;
        return ans;
    }

    public static int getDepth(GenericNode root, int target) {
        return getLevel(root, target, 1);
    }

    public static int maxHeight(GenericNode root) {
        int max = 0;

        for(GenericNode child: root.children) {
            max = Math.max(max, maxHeight(child));
        }
        return max + 1;
    }

    public static int getHeight(GenericNode root, int target) {

        if(root.data == target) {
            return maxHeight(root);
        }
        for(GenericNode child: root.children) {
            int currAns = getHeight(child, target);
            if(currAns != -1) {
                return currAns;
            }
        }
        return -1;
    }

    public static List<Integer> getAncestors(GenericNode root, int data) {
        List<Integer> ans = getPath(root, data);
        Collections.reverse(ans);
        ans.remove(0);
        return ans;
    }

    public static int lowestCommonAncestor(GenericNode root, int node1, int node2) {
        List<Integer> ancestor1 = getAncestors(root, node1);
        List<Integer> ancestor2 = getAncestors(root, node2);

        int i=ancestor1.size()-1, j=ancestor2.size()-1;
        while(i >-1 && j > -1 && ancestor1.get(i).equals(ancestor2.get(j))) {
            i--;
            j--;
        }
        return ancestor1.get(i+1);
    }

    public static void createMirror(GenericNode root) {
        for(GenericNode child: root.children) {
            createMirror(child);
        }
        Collections.reverse(root.children);
    }


    public static void main(String[] args) {
//        GenericNode root = new GenericNode(10);
//        root.children.add(new GenericNode(20));
//        root.children.add(new GenericNode(5));
//
//        root.children.get(0).children.add(new GenericNode(15));
//        root.children.get(0).children.add(new GenericNode(25));
//        root.children.get(0).children.add(new GenericNode(35));
//
//        root.children.get(1).children.add(new GenericNode(7));

//        int[] treeData = {1,3,2,1,5,0,3,2,6,0,7,0,4,0};
        int[] treeData = {1,2,2,3,4,0,5,1,6,0,7,0,3,1,8,2,9,0,10,0};

        GenericNode root = create(treeData);

//        preOrder(root);
//        System.out.println();
//        postOrder(root);

//        System.out.println(search(root, 60));
//        System.out.println(getMax(root));
//        System.out.println(getLeafCount(root));
//        System.out.println(getLevel(root, 4, 0));
//        print(root);
//        replaceNodeWithLeafCount(root);
//        System.out.println("After replacing");
//        print(root);
//        System.out.println(getHeight(root, 4));
//        printAllPath(root, new ArrayList<>());
//        System.out.println(getPath(root, 5));
//        System.out.println(getAncestors(root, 7));
//        System.out.println(lowestCommonAncestor(root, 4,10));
        print(root);
        createMirror(root);
        System.out.println("After mirror");
        print(root);
    }

}

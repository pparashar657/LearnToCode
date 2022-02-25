package trees.generic;

import java.util.LinkedList;
import java.util.Queue;

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

        int[] treeData = {1,3,2,1,5,0,3,2,6,0,7,0,4,0};

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
        System.out.println(getHeight(root, 4));
    }

}

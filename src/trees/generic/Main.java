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

        preOrder(root);
        System.out.println();
        postOrder(root);
    }

}

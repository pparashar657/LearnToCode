package trees.bst;

import trees.binary.Node;

public class DeleteNode {
    
    public Node deleteNode(Node root, int key) {

        if ( root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }  else {
            root = deleteTarget(root);
        }
        return root;
    }

    public Node deleteTarget(Node root) {
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            int newRoot = max(root.left);
            root.data = newRoot;
            root.left = deleteNode(root.left, newRoot);
            return root;
        }
    }

    int max(Node root) {
        while(root.right != null) {
            root = root.right;
        }
        return root.data;
    }

}

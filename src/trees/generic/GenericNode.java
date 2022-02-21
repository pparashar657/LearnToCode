package trees.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericNode {
    int data;
    List<GenericNode> children;

    public GenericNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

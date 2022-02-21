package trees.generic;

public class Main {

    public static void main(String[] args) {
        GenericNode root = new GenericNode(10);
        root.children.add(new GenericNode(20));
        root.children.add(new GenericNode(5));

        root.children.get(0).children.add(new GenericNode(15));
        root.children.get(0).children.add(new GenericNode(25));
        root.children.get(0).children.add(new GenericNode(35));

        root.children.get(1).children.add(new GenericNode(7));



    }

}

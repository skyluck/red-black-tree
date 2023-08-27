public class Main {
    public static void main(String[] args) {
        RBTree<String> bst = new RBTree<String>();
        bst.addNode("d");
        bst.addNode("d");
        bst.addNode("c");
        bst.addNode("c");
        bst.addNode("b");
        bst.addNode("f");

        bst.addNode("a");
        bst.addNode("e");

        bst.addNode("g");
        bst.addNode("h");


        bst.remove("c");

        bst.printTree();
    }
}
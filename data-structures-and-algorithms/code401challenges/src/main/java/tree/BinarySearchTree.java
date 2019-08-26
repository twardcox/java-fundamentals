package tree;

public class BinarySearchTree {

    protected Node<Integer> root;

//    https://www.baeldung.com/java-binary-tree

    private Node<Integer> add(Node<Integer> current, int value) {

        if (current == null) {
            return new Node<>(value);
        }

        if (value < current.value){
            current.left = add(current.left, value);
        } else if (value > current.value){
            current.right = add(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = add(this.root, value);
    }



    private boolean contains(Node<Integer> current, int value){
        if (current == null) {
            return false;
        }

        if (value == current.value){
            return true;
        }

        return value < current.value ? contains(current.left, value) : contains(current.right
        , value);
    }

    public boolean containsNode(int value){
        return contains(this.root, value);
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }


}

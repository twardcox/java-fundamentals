package tree;

import java.util.ArrayList;

//https://www.baeldung.com/java-binary-tree

public class Tree<T> {

    protected Node root;

    private ArrayList<T> returnValues = new ArrayList<>();

    protected void inOrder(Node<T> current){
        if (current != null){

            inOrder(current.left);
            this.returnValues.add(current.value);
            inOrder(current.right);
        }
    }

    protected void preOrder(Node<T> current){
        if (current != null){
            this.returnValues.add(current.value);
            inOrder(current.left);
            inOrder(current.right);
        }
    }

    protected void postOrder(Node<T> current){
        if (current != null){

            inOrder(current.left);
            inOrder(current.right);
            this.returnValues.add(current.value);
        }
    }

    public ArrayList<T> getReturnValues() {
        return returnValues;
    }


}

package tree;

import code401challenges.stacksandqueues.Queue;

import java.util.ArrayList;

//https://www.baeldung.com/java-binary-tree

public class Tree<T> {

    protected Node <T> root;

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

    private int max = Integer.MIN_VALUE;

    protected Integer find_maximum_value(Node<T> current){


        if (current != null){
            if ((int) current.value > max){
                max = (int) current.value;
            }
            find_maximum_value(current.left);
            find_maximum_value(current.right);
        }
        return max;

    }

    protected void postOrder(Node<T> current){
        if (current != null){

            inOrder(current.left);
            inOrder(current.right);
            this.returnValues.add(current.value);
        }
    }

//    https://stackoverflow.com/questions/16380026/implementing-bfs-in-java
    protected ArrayList breadthFirstSearch(Tree tree){
        Queue<Node> queue = new Queue<>();
        ArrayList<Integer> result = new ArrayList<>();
        Node<T> root = tree.root;

        if (tree.root == null){
            return result;
        }

//      passing the first node into the queue
        queue.enqueue(tree.root);

//        while the queue has node left continue
        while (!queue.isEmpty()){
//            dequeue the first node in the queue
            Node temp = queue.dequeue();
//            print temp value
            System.out.println(temp.value);
            result.add((Integer) temp.value);

            if (temp.left != null){
                queue.enqueue(temp.left);
            }

            if (temp.right != null){
                queue.enqueue(temp.right);
            }
        }
        return result;
    }

    public ArrayList<T> getReturnValues() {
        return returnValues;
    }


}

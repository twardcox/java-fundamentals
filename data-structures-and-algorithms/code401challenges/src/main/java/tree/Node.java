package tree;

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    Node(T value, Node<T> right, Node<T> left){
        this.value = value;
        this.right = right;
        this.left = left;
    }


    Node(T value){
        this.value = value;
        right = null;
        left = null;
    }
}

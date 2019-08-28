package code401challenges.stacksandqueues;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;

    public void enqueue(T value){
      Node<T> new_node = new Node<>();
      new_node.value = (T) value;

      if(this.front == null){
        this.back = new_node;
        this.front = new_node;
        return;
      }

      this.back.next = new_node;
      this.back = new_node;
    }

    public T dequeue(){
      if(this.back == null){
        throw new NullPointerException();
      }

      Node<T> temp = this.front;
      this.front = temp.next;
      temp.next = null;

      return temp.value;
    }

    public T peek(){
      return this.front.value;
    }

    public boolean isEmpty(){
      return this.front == null;
    }


    public String toString(){
      return setToString(this.front);
    }

    private String setToString(Node<T> node){
      if (node == null){
        return "null";
      }

      return node.value + " -> " + setToString(node.next);
    }

  }


package code401challenges.linkedList;

public class Node<T> {
  public T value;
  Node<T> next;

  //    Constructor
  public Node(T v)
  {
    value = v;
    next = null;
  }

}

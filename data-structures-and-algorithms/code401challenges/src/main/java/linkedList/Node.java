package linkedList;

public class Node<T> {
  public T value;
  Node<T> next;

  //    Constructor
  Node(T v)
  {
    value = v;
    next = null;
  }
}

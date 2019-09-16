package code401challenges.hashtable;

public class Node<T> {
  public String value;
  public String key;
  Node<T> next;

  //    Constructor
  public Node(String k, String v)
  {
    value = v;
    key = (String) k;
    next = null;
  }

  public T getValue() {
    return (T) value;
  }

  public void setValue(T value) {
    this.value = (String) value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(T key) {
    this.key = (String) key;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }
}

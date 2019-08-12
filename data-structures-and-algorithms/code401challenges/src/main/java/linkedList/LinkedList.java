package linkedList;

public class LinkedList {
  public Node head;

  static class Node {
    int value;
    Node next;

//    Constructor
    Node(int v)
    {
      value = v;
      next = null;
    }
  }

  public LinkedList insert(LinkedList list, int value){
    Node new_node = new Node(value);
    new_node.next = null;

    if (list.head == null) {
      list.head = new_node;
    } else {
      Node last = list.head;
      while(last.next != null){
        last = last.next;
      }
      last.next = new_node;
    }
    return list;
  }

  public boolean includes(LinkedList list, int value){
    Node currentNode = list.head;
    while (currentNode != null){
      if (currentNode.value == value){
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  public String toString(LinkedList list){
    Node currentNode = list.head;

    StringBuilder out = new StringBuilder();

    while (currentNode != null){
      if (currentNode.next != null){
      out.append(currentNode.value).append(", ");
      } else {
        out.append(currentNode.value);
      }
      currentNode = currentNode.next;
    }
    return out.toString();
  }

}



package linkedList;

import java.util.ArrayList;

public class LinkedList<T> {
  public Node<T> head;

  public LinkedList insert(LinkedList list, T value){
    Node<T> new_node = new Node<T>(value);
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

  public boolean includes(LinkedList<Integer> list, T value){
    Node<Integer> currentNode = list.head;
    while (currentNode != null){
      if (currentNode.value == value){
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  public String toString(LinkedList<Integer> list){
    Node<Integer> currentNode = list.head;

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

  public void append(LinkedList<T> list, T value){
    Node<T> currentNode = list.head;

    while (currentNode.next != null){
      currentNode = currentNode.next;
    }
    Node<T> nextNode = new Node<>(value);
    currentNode.next = nextNode;
  }

  public void insertAfter(LinkedList<T> list, T value, T newValue){
    Node<T> currentNode = list.head;

    while (currentNode.next != null){
      currentNode = currentNode.next;
      if (currentNode.value == value){
        break;
      }
    }
    T temp = (T) currentNode.next;
    Node<T> newNext = new Node<>(newValue);
    newNext.next = (Node<T>) temp;
    currentNode.next = newNext;
  }

  public void insertBefore(LinkedList<T> list, T value, T newValue){
    Node<T> currentNode = list.head;

    while (currentNode.next != null){

      if (currentNode.next.value == value){
        break;
      }
      currentNode = currentNode.next;
    }
    Node<T> temp = currentNode.next;
    Node<T> newNext = new Node<>(newValue);
    newNext.next = temp;
    currentNode.next = newNext;
  }

  public String kthFromEnd(LinkedList<T> list, int k){
    ArrayList<T> savedValues = new ArrayList<T>();
    Node<T> currentNode = list.head;

    while (currentNode != null){
      savedValues.add(currentNode.value);
      currentNode = currentNode.next;
      }

    if (k > savedValues.size()){
      return "Your K size greater than the list size.";
    } else if (k < 0){
      return "your K size is less than zero.";
    } else if (k == savedValues.size()){
      return savedValues.get(savedValues.size()-1).toString();
    }
    int index = (savedValues.size() - 1) - k;
    return savedValues.get(index).toString();

  }

};






package code401challenges.TreeIntersection;

import code401challenges.hashtable.HashTable;
import tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

  public static List<String> tree_intersection(BinarySearchTree leftTree, BinarySearchTree rightTree){
    HashTable leftHash = new HashTable(1024);
    List<String> finalArr = new ArrayList<>();
//    iterate over left tree adding each node to the hashtable.
    leftTree.inOrder(leftTree.root);
    rightTree.inOrder(rightTree.root);

    for(Object item : leftTree.returnValues){
      leftHash.add(item.toString(), item.toString());
    }

    for (Object item : rightTree.returnValues){
      if (leftHash.contains(item.toString())){
        finalArr.add(item.toString());
      }
    }

    return finalArr;
  }

}

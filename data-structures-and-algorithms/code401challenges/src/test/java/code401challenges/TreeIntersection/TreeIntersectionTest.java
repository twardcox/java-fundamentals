package code401challenges.TreeIntersection;

import org.junit.Test;
import tree.BinarySearchTree;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

  @Test
  public void testTree_intersection_Happy() {
    BinarySearchTree left = new BinarySearchTree(){};
    left.add(150);
    left.add(100);
    left.add(75);
    left.add(160);
    left.add(125);
    left.add(175);
    left.add(250);
    left.add(200);
    left.add(350);
    left.add(300);
    left.add(500);
    BinarySearchTree right = new BinarySearchTree(){};
    right.add(42);
    right.add(100);
    right.add(15);
    right.add(160);
    right.add(125);
    right.add(175);
    right.add(600);
    right.add(200);
    right.add(350);
    right.add(4);
    right.add(500);

    assertEquals("testTree_intersection_Happy","[100, 125, 160, 175, 200, 350, 500]",
                 TreeIntersection.tree_intersection(left, right).toString());
  }

  @Test
  public void testTree_intersection_AllTheSameNumber() {
    BinarySearchTree left = new BinarySearchTree(){};
    left.add(150);
    left.add(150);
    left.add(150);
    left.add(150);

    BinarySearchTree right = new BinarySearchTree(){};
    right.add(150);
    right.add(150);
    right.add(150);
    right.add(150);

    assertEquals("testTree_intersection_AllTheSameNumber should be equal","[150]",
                 TreeIntersection.tree_intersection(left, right).toString());
  }

  @Test
  public void testTree_intersection_EmptyTree() {
    BinarySearchTree left = new BinarySearchTree(){};


    BinarySearchTree right = new BinarySearchTree(){};


    assertEquals("testTree_intersection_EmptyTree should be equal","[]",
                 TreeIntersection.tree_intersection(left, right).toString());
  }
}
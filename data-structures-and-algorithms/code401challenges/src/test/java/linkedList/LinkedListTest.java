package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {


  @Test
  public void testEmptyLinkedList(){
    LinkedList list = new LinkedList();
    assertNull("testEmptyLinkedList should be empty.",list.head);
  }

  @Test
  public void testFirstNode(){
    LinkedList list = new LinkedList();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    assertEquals("testFirstNode head value should be 1.", list.head.value, 1);
  }


  @Test
  public void testInsertNewNode() {
    LinkedList list = new LinkedList();
    list.insert(list, 1);
    assertNotNull("testInsertNewNode head value should not be null.", list);
  }

  @Test
  public void testIncludesTrue() {
    LinkedList list = new LinkedList();
    list.insert(list, 1);
    assertTrue("testIncludesTrue value should be True.", list.includes(list, 1));
  }

  @Test
  public void testIncludesFalse() {
    LinkedList list = new LinkedList();
    list.insert(list, 1);
    assertFalse("testIncludesFalse value should be False.", list.includes(list, 2));
  }

  @Test
  public void testInsertMultiple(){
    LinkedList list = new LinkedList();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    assertEquals("testInsertMultiple value should be Equal.", list.toString(list), "1, 2, 3");
  }

}
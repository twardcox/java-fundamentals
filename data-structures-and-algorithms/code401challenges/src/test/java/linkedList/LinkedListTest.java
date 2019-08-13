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
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    assertEquals("testFirstNode head value should be 1.", "1, 2, 3", list.toString(list));
  }


  @Test
  public void testInsertNewNode() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(list, 1);
    assertNotNull("testInsertNewNode head value should not be null.", list);
  }

  @Test
  public void testIncludesTrue() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(list, 1);
    assertTrue("testIncludesTrue value should be True.", list.includes(list, 1));
  }

  @Test
  public void testIncludesFalse() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(list, 1);
    assertFalse("testIncludesFalse value should be False.", list.includes(list, 2));
  }

  @Test
  public void testInsertMultiple(){
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    assertEquals("testInsertMultiple value should be Equal.", "1, 2, 3", list.toString(list));
  }

  @Test
  public void testAppend(){
    LinkedList<Integer> list = new LinkedList<>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.append(list, 3);
    assertEquals("testAppend value should be Equal.", "1, 2, 3", list.toString(list));
  }

  @Test
  public void testInsertAfter(){
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    list.insert(list, 5);
    list.insertAfter(list, 3, 4);
    assertEquals("testInsertAfter value should be Equal.", "1, 2, 3, 4, 5", list.toString(list));
  }

  @Test
  public void testInsertBefore(){
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    list.insert(list, 5);
    list.insertBefore(list, 5, 4);
    assertEquals("testInsertAfter value should be Equal.", "1, 2, 3, 4, 5",list.toString(list));
  }

}
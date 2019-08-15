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

  @Test
  public void testKthFromEndHappy() {
    LinkedList<Integer> list = new LinkedList<>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    list.insert(list, 5);
    assertEquals("testKthFromEndHappy should be equal","2", list.kthFromEnd(list, 2));
  }

  @Test
  public void testKthFromEnd_KGreaterThanSize() {
    LinkedList<Integer> list = new LinkedList<>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    list.insert(list, 5);
    assertEquals("testKthFromEnd_KGreaterThanSize should be equal","Your K size greater than the list size.", list.kthFromEnd(list, 6));
  }

  @Test
  public void testKthFromEnd_KLessThanZero() {
    LinkedList<Integer> list = new LinkedList<>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    list.insert(list, 5);
    assertEquals("testKthFromEnd_KLessThanZero should be equal","your K size is less than zero.", list.kthFromEnd(list, -1));
  }

  @Test
  public void testKthFromEnd_KEqualsSize() {
    LinkedList<Integer> list = new LinkedList<>();
    list.insert(list, 1);
    list.insert(list, 2);
    list.insert(list, 3);
    list.insert(list, 5);
    assertEquals("testKthFromEnd_KEqualsSize should be equal","5", list.kthFromEnd(list, 4));
  }

  @Test
  public void testKthFromEnd_SizeEqualsOne() {
    LinkedList<Integer> list = new LinkedList<>();
    list.insert(list, 1);
    assertEquals("testKthFromEnd_SizeEqualsOne should be equal","1", list.kthFromEnd(list, 1));
  }

  @Test
  public void testMergeList(){
    LinkedList<Integer> listOne = new LinkedList<>();
    listOne.insert(listOne, 1);
    listOne.append(listOne, 3);
    listOne.append(listOne, 5);
    listOne.append(listOne, 7);

    LinkedList<Integer> listTwo = new LinkedList<>();
    listTwo.insert(listTwo, 2);
    listTwo.append(listTwo, 4);
    listTwo.append(listTwo, 6);
    listTwo.append(listTwo, 8);

    assertEquals("testMergeList should be equal","1, 2, 3, 4, 5, 6, 7, 8", listOne.toString(LinkedList.mergeLists(listOne, listTwo)));
  }
}
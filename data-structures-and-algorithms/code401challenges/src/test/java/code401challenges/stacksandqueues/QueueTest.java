//package code401challenges.stacksandqueues;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class QueueTest {
//
////  @Test
////  public void testEnqueue_Happy(){
////    Queue<Integer> queue = new Queue<>();
////    queue.enqueue(7);
////    queue.enqueue(7);
////    queue.enqueue(7);
////    queue.enqueue(7);
////    System.out.println(queue);
////
////    assertEquals("testEnqueue_Happy should be equal.", "7 -> 7 -> 7 -> 7 -> null", queue.toString());
////  }
//
//  @Test
//  public void testDequeue_Happy() {
//    Queue<Integer> queue = new Queue<>();
//    queue.enqueue(7);
//    queue.enqueue(8);
//    queue.enqueue(9);
//    int returnedVal = queue.dequeue();
//    System.out.println(returnedVal);
//    System.out.println(queue);
//    assertEquals("testDequeue_Happy should be equal.", "8 -> 9 -> null", queue.toString());
//  }
//
//  @Test
//  public void testEmptyDequeue_Happy() {
//    Queue<Integer> queue = new Queue<>();
//    queue.enqueue(7);
//    queue.enqueue(8);
//    queue.enqueue(9);
//    int returnedVal1 = queue.dequeue();
//    int returnedVal2 = queue.dequeue();
//    int returnedVal3= queue.dequeue();
//    System.out.println(returnedVal1);
//    System.out.println(returnedVal2);
//    System.out.println(returnedVal3);
//    System.out.println(queue);
//    assertEquals("testEmptyDequeue_Happy should be equal.", "null", queue.toString());
//  }
//
//  @Test
//  public void testPeek_Happy() {
//    Queue<Integer> queue = new Queue<>();
//    queue.enqueue(7);
//    queue.enqueue(8);
//    queue.enqueue(9);
//
//    assertEquals("testPeek_Happy should be equal.", "7", queue.peek().toString());
//  }
//
//  @Test
//  public void testEmptyQueue_Happy(){
//    Queue<Integer> queue = new Queue<>();
//    assertEquals("testEmptyQueue_Happy should be equal", "null", queue.toString());
//  }
//}
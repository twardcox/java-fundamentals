package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

  @Test
  public void testEnqueue_Happy() {
    PseudoQueue<Integer> PseudoQueue = new PseudoQueue<>();
    PseudoQueue.enqueue(7);
    PseudoQueue.enqueue(8);
    PseudoQueue.enqueue(9);
//    System.out.println(PseudoQueue.back.toString());
    assertEquals("testPop_Happy should be equal.", "9 -> 8 -> 7 -> null", PseudoQueue.back.toString());
  }

  @Test
  public void testEnqueue_FrontTopNotNull() {
    PseudoQueue<Integer> PseudoQueue = new PseudoQueue<>();
    PseudoQueue.enqueue(7);
    PseudoQueue.enqueue(8);
    PseudoQueue.enqueue(9);
    //    System.out.println(PseudoQueue.back.toString());
    assertEquals("testPop_Happy should be equal.", "9 -> 8 -> 7 -> null", PseudoQueue.back.toString());
  }



  @Test
  public void testDequeue_Happy() {
    PseudoQueue<Integer> PseudoQueue = new PseudoQueue<>();
    PseudoQueue.enqueue(7);
    PseudoQueue.enqueue(8);
    PseudoQueue.enqueue(9);
    assertEquals("testDequeue_Happy should equal 7", "7", PseudoQueue.dequeue().toString());
  }
}
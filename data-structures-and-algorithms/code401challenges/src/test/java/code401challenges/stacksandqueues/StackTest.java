package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

  @Test
  public void testPush_Happy() {
    Stack<Integer> stack = new Stack<>();
    stack.push(7);
    stack.push(7);
    stack.push(7);
    stack.push(7);
    System.out.println(stack);

    assertEquals("testPush_Happy should be equal.", "7 -> 7 -> 7 -> 7 -> null", stack.toString());
  }


  @Test
  public void testPop_Happy() {
    Stack<Integer> stack = new Stack<>();
    stack.push(7);
    stack.push(8);
    stack.push(9);
    int returnedVal = stack.pop();
    System.out.println(returnedVal);
    System.out.println(stack);
    assertEquals("testPop_Happy should be equal.", "8 -> 7 -> null", stack.toString());
  }

  @Test
  public void testEmptyPop_Happy() {
    Stack<Integer> stack = new Stack<>();
    stack.push(7);
    stack.push(8);
    stack.push(9);
    int returnedVal1 = stack.pop();
    int returnedVal2 = stack.pop();
    int returnedVal3 = stack.pop();
    System.out.println(returnedVal1);
    System.out.println(returnedVal2);
    System.out.println(returnedVal3);
    System.out.println(stack);
    assertEquals("testEmptyPop_Happy should be equal.", "null", stack.toString());
  }

  @Test
  public void testPeek_Happy() {
    Stack<Integer> stack = new Stack<>();
    stack.push(7);
    stack.push(8);
    stack.push(9);
    System.out.println(stack.peek());
  assertEquals("testPeek_Happy should be equal.", "9", stack.peek().toString());
  }

  @Test
  public void testEmptyStack_Happy(){
    Stack<Integer> stack = new Stack<>();
    System.out.println(stack);
    assertEquals("testEmptyStack_Happy should be equal", "null", stack.toString());
  }

}
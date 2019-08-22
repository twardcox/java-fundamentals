package code401challenges.stacksandqueues;

public class PseudoQueue<T> {
  protected Stack<T> front = new Stack<>();
  protected Stack<T> back = new Stack<>();

  public void enqueue(T value) {

    if (front.top == null) {
      back.push(value);
    } else {
      while (front.top != null) {
        back.push(front.pop());
      }
      back.push(value);
    }

  }

  public T dequeue(){
    if (front.top == null && back.top == null){
      return null;
    }

    if(back.top == null){
      return front.pop();
    } else {
      while (back.top != null){
        front.push(back.pop());
      }
      return front.pop();
    }
  }

}

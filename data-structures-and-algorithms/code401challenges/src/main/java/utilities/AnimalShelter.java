package utilities;

import stacksandqueues.Queue;

public class AnimalShelter<Object> {
  private Queue<Cat> cats = new Queue<>();
  private Queue<Dog> dogs = new Queue<>();

  public Queue<Cat> getCats() {
    return cats;
  }

  public Queue<Dog> getDogs() {
    return dogs;
  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
        "cats=" + cats +
        ", dogs=" + dogs +
        '}';
  }

  public void enqueue(Object animal){
    if(animal.getClass() == Cat.class){
      cats.enqueue((Cat) animal);
    } else if (animal.getClass() == Dog.class){
      dogs.enqueue((Dog) animal);
    }
  }

  public Object dequeue(String pref){
    if(pref.toLowerCase().equals("cat")){
      return (Object) cats.dequeue();
    } else if (pref.toLowerCase().equals("dog")){
      return (Object) dogs.dequeue();
    }
    return null;
  }
}

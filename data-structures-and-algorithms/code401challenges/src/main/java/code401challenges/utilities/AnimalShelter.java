package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

public class AnimalShelter<Object> {
  private Queue<AdoptableAnimals> cats = new Queue<>();
  private Queue<AdoptableAnimals> dogs = new Queue<>();

  public Queue<AdoptableAnimals> getCats() {
    return cats;
  }

  public Queue<AdoptableAnimals> getDogs() {
    return dogs;
  }

  public java.lang.String toString() {
    return "AnimalShelter{" +
        "cats=" + cats +
        ", dogs=" + dogs +
        '}';
  }

  public void enqueue(AdoptableAnimals animal){
    if(animal.getClass() == Cat.class){
      cats.enqueue(animal);
    } else if (animal.getClass() == Dog.class){
      dogs.enqueue(animal);
    }
  }

  public AdoptableAnimals dequeue(String pref){
    if(pref.toLowerCase().equals("cat")){
      return cats.dequeue();
    } else if (pref.toLowerCase().equals("dog")){
      return dogs.dequeue();
    }
    return null;
  }
}

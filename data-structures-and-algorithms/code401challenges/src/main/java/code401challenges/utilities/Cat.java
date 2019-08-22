package code401challenges.utilities;

public class Cat extends Animal implements AdoptableAnimals{
  private String name;
  private String breed;
  private String hairLength;
  private int age;

//  constructor
  public Cat(String species, String locomotion, String mainSense, String name, String breed, String hairLength, int age) {
    super(species, locomotion, mainSense);
    this.name = name;
    this.breed = breed;
    this.hairLength = hairLength;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getBreed() {
    return breed;
  }

  public String getHairLength() {
    return hairLength;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "name='" + name + '\'' +
        ", breed='" + breed + '\'' +
        ", hairLength='" + hairLength + '\'' +
        ", age=" + age +
        '}';
  }
}

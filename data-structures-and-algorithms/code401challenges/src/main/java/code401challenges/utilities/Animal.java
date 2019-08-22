package code401challenges.utilities;

public class Animal {

//  Instance Variables
  private String species;
  private String locomotion;
  private String mainSense;

  public Animal(String species, String locomotion, String mainSense) {
    this.species = species;
    this.locomotion = locomotion;
    this.mainSense = mainSense;
  }

  public String getSpecies() {
    return species;
  }

  public String getLocomotion() {
    return locomotion;
  }

  public String getMainSense() {
    return mainSense;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "species='" + species + '\'' +
        ", locomotion='" + locomotion + '\'' +
        ", mainSense='" + mainSense + '\'' +
        '}';
  }
}

package inheritance;

import java.util.ArrayList;

public class Shop {
  private String name;
  private String description;
  private String price;
  private int stars;
  private ArrayList<Review> reviews = new ArrayList<>();

  //    constructor
  Shop(String name, String description, int stars, String price) {
    this.name = name;
    this.description = description;
    this.stars = stars;
    this.price = price;
  }

  public int getStars() {
    return stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public void setReviews(ArrayList<Review> reviews) {
    this.reviews = reviews;
  }

  @Override
  public String toString() {
    return "Shop{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", price='" + price + '\'' +
        ", reviews=" + reviews +
        '}';
  }

  public void addReview(String body, String author, int stars, Shop shop){

    reviews.add(new Review(body, author, stars, this));
    int sum = 0;
    for (Review review : this.reviews){
      sum += review.getStars();
    }
    this.setStars(sum / this.reviews.size());
  }
}

package inheritance;

import java.util.ArrayList;
import java.util.HashSet;

public class Theater {
    private String name;
    private int stars;
    private ArrayList<Review> reviews = new ArrayList<>();
    private HashSet<String> movies = new HashSet<>();

    //    constructor
    Theater(String name, int stars) {
      this.name = name;
      this.stars = stars;
    }


  public void addReview(String body, String author, int stars, Theater theater){

    reviews.add(new Review(body, author, stars,this));
    int sum = 0;
    for (Review review : this.reviews){
      sum += review.getStars();
    }
    this.setStars(sum / this.reviews.size());
  }

  public void addMovie(String movieName){
      movies.add(movieName);
  }

  @Override
  public String toString() {
    return "Theater{" +
        "name='" + name + '\'' +
        ", stars=" + stars +
        ", reviews=" + reviews +
        ", movies=" + movies +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStars() {
    return stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public HashSet<String> getMovies() {
    return movies;
  }

  public void removeMovie(String movieName){
      movies.remove(movieName);
  }


}

package inheritance;

public class Review {
  private String body;
  private String author;
  private int stars;

  public Review(String body, String author, int stars) {
    this.body = body;
    this.author = author;
    this.stars = stars;

  }

  @Override
  public String toString() {
    return String.format("%s writes %s giving them %d stars", this.getAuthor(), this.getBody(), this.getStars());
  }

  public String getBody() {
    return this.body;
  }

  public String getAuthor() {
    return this.author;
  }

  public int getStars() {
    return this.stars;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }
}

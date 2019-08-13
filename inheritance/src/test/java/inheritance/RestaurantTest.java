package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

  @Test
  public void testGetNameHappy() {
    Restaurant McCoxs = new Restaurant("McCoxs", 3, "$");
    assertEquals("testGetNameHappy: Name should be McCoxs", "McCoxs", McCoxs.getName());
  }

  @Test
  public void testGetStarsHappy() {
    Restaurant McCoxs = new Restaurant("McCoxs", 3, "$");
    assertEquals("testGetStarsHappy: Stars should be 3", 3, McCoxs.getStars());

  }

  @Test
  public void testGetPriceHappy() {
    Restaurant McCoxs = new Restaurant("McCoxs", 3, "$");
    assertEquals("testGetPriceHappy: Price should be $", "$", McCoxs.getPrice());

  }

  @Test
  public void testToStringHappy() {
    Restaurant McCoxs = new Restaurant("McCoxs", 3, "$");
    assertEquals("testToStringHappy: Should equal", "McCoxs is a 3 star restaurant that costs $", McCoxs.toString());
  }

  @Test
  public void testAddReviewHappy() {
    Restaurant McCoxs = new Restaurant("McCoxs", 3, "$");
    McCoxs.addReview("What do you Know?", "Matt Stuhring", 5);
    assertEquals("testSetReviewHappy should be equal", "Matt Stuhring writes What do you Know? giving them 5 stars", McCoxs.getReviews().get(0).toString());

  }

  @Test
  public void testAddReview_UpdateStars_Happy() {
    Restaurant McCoxs = new Restaurant("McCoxs", 3, "$");
    McCoxs.addReview("What do you Know?", "Matt Stuhring", 5);
    McCoxs.addReview("Who do you Know?", "Jack Kinne", 3);
    assertEquals("testAddReview_UpdateStars_Happy should be equal", 4, McCoxs.getStars());
  }
}
package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

  Shop McCoxs;

  @Before
  public void setup() {
    McCoxs = new Shop("McCoxs", "Mortuary", 3, "$$");
  }

  @Test
  public void testGetNameHappy() {

    assertEquals("testGetNameHappy: Name should be McCoxs", "McCoxs", McCoxs.getName());
  }

  @Test
  public void testGetStarsHappy() {

    assertEquals("testGetStarsHappy: Stars should be 3", 3, McCoxs.getStars());

  }

  @Test
  public void testGetPriceHappy() {

    assertEquals("testGetPriceHappy: Price should be $", "$$", McCoxs.getPrice());

  }

  @Test
  public void testToStringHappy() {

    assertEquals("testToStringHappy: Should equal", "Shop{name='McCoxs', description='Mortuary', price='$$', reviews=[]}", McCoxs.toString());
  }

  @Test
  public void testAddReviewHappy() {

    McCoxs.addReview("What do you Know?", "Matt Stuhring", 5, McCoxs);
    assertEquals("testSetReviewHappy should be equal", "Matt Stuhring writes What do you Know? giving them 5 stars", McCoxs.getReviews().get(0).toString());

  }

  @Test
  public void testAddReview_UpdateStars_Happy() {
    McCoxs.addReview("What do you Know?", "Matt Stuhring", 5, McCoxs);
    McCoxs.addReview("Who do you Know?", "Jack Kinne", 3, McCoxs);
    assertEquals("testAddReview_UpdateStars_Happy should be equal", 4, McCoxs.getStars());
  }
}
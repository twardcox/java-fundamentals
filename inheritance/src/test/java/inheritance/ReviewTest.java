package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
  Restaurant McCoxs;

  @Before
  public void setup() {
    McCoxs = new Restaurant("McCoxs", 0, "$");
  }

  @Test
  public void testToStringHappy() {
    McCoxs.addReview("You stab'em... they'll slab'em", "Mad Man", 5, McCoxs);
    assertEquals("testToStringHappy should be equal",  "[Mad Man writes You stab'em... they'll slab'em giving them 5 stars]", McCoxs.getReviews().toString());
  }

  @Test
  public void testGetBodyHappy() {
    McCoxs.addReview("You stab'em... they'll slab'em", "Mad Man", 5, McCoxs);
    assertEquals("testGetBodyHappy should be equal",  "You stab'em... they'll slab'em", McCoxs.getReviews().get(0).getBody());
  }


  @Test
  public void testGetAuthorHappy() {
    McCoxs.addReview("You stab'em... they'll slab'em", "Mad Man", 5, McCoxs);
    assertEquals("testGetAuthorHappy should be equal",  "Mad Man", McCoxs.getReviews().get(0).getAuthor());
  }


  @Test
  public void testGetStarsHappy() {
    McCoxs.addReview("You stab'em... they'll slab'em", "Mad Man", 5, McCoxs);
    assertEquals("testGetStarsHappy should be equal",  5, McCoxs.getReviews().get(0).getStars());
  }

  @Test
  public void testSetBodyHappy() {
    McCoxs.addReview("You stab'em... they'll slab'em", "Mad Man", 5, McCoxs);
    McCoxs.getReviews().get(0).setBody("Come at me Bro!");
    assertEquals("testSetBodyHappy should be equal",  "Come at me Bro!", McCoxs.getReviews().get(0).getBody());
  }

  @Test
  public void testSetAuthorHappy() {
    McCoxs.addReview("You stab'em... they'll slab'em", "Mad Man", 5, McCoxs);
    McCoxs.getReviews().get(0).setAuthor("Billy Bob");
    assertEquals("testSetAuthorHappy should be equal",  "Billy Bob", McCoxs.getReviews().get(0).getAuthor());
  }

  @Test
  public void testSetStarsHappy() {
    McCoxs.addReview("You stab'em... they'll slab'em", "Mad Man", 5, McCoxs);
    McCoxs.getReviews().get(0).setStars(1);
    assertEquals("testSetStarsHappy should be equal",  1, McCoxs.getReviews().get(0).getStars());
  }

}
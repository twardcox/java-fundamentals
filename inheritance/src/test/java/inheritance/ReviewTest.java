package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

  @Test
  public void testToStringHappy() {
    Review McCoxs = new Review("You stab'em... they'll slab'em", "Mad Man", 5);
    assertEquals("testToStringHappy should be equal",  "Mad Man writes You stab'em... they'll slab'em giving them 5 stars", McCoxs.toString());
  }

  @Test
  public void testGetBodyHappy() {
    Review McCoxs = new Review("You stab'em... they'll slab'em", "Mad Man", 5);
    assertEquals("testGetBodyHappy should be equal",  "You stab'em... they'll slab'em", McCoxs.getBody());
  }


  @Test
  public void testGetAuthorHappy() {
    Review McCoxs = new Review("You stab'em... they'll slab'em", "Mad Man", 5);
    assertEquals("testGetAuthorHappy should be equal",  "Mad Man", McCoxs.getAuthor());
  }


  @Test
  public void testGetStarsHappy() {
    Review McCoxs = new Review("You stab'em... they'll slab'em", "Mad Man", 5);
    assertEquals("testGetStarsHappy should be equal",  5, McCoxs.getStars());
  }

  @Test
  public void testSetBodyHappy() {
    Review McCoxs = new Review("You stab'em... they'll slab'em", "Mad Man", 5);
    McCoxs.setBody("Come at me Bro!");
    assertEquals("testSetBodyHappy should be equal",  "Come at me Bro!", McCoxs.getBody());
  }

  @Test
  public void testSetAuthorHappy() {
    Review McCoxs = new Review("You stab'em... they'll slab'em", "Mad Man", 5);
    McCoxs.setAuthor("Billy Bob");
    assertEquals("testSetAuthorHappy should be equal",  "Billy Bob", McCoxs.getAuthor());
  }

  @Test
  public void testSetStarsHappy() {
    Review McCoxs = new Review("You stab'em... they'll slab'em", "Mad Man", 5);
    McCoxs.setStars(1);
    assertEquals("testSetStarsHappy should be equal",  1, McCoxs.getStars());
  }
}
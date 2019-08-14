package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class TheaterTest {

  Theater McCoxs;

  @Before
  public void setup() {
    McCoxs = new Theater("McCoxs", 3);
  }

  @Test
  public void testAddReview_Happy() {
    McCoxs.addReview("You are Awesome", "Travis", 3, McCoxs);
    assertEquals("testAddReview_Happy should be equal", "[Travis writes You are Awesome giving them 3 stars]", McCoxs.getReviews().toString() );
  }

  @Test
  public void testaddMovie_Happy() {
    McCoxs.addMovie("Wilbur");
    assertEquals("testaddMovie_Happy should be equal", "[Wilbur]", McCoxs.getMovies().toString() );

  }

  @Test
  public void testToString_Happy() {
    assertEquals("testToString_Happy should be equal", "Theater{name='McCoxs', stars=3, reviews=[], movies=[]}", McCoxs.toString() );

  }

  @Test
  public void testGetName_Happy() {
    assertEquals("testGetName_Happy should be equal", "McCoxs", McCoxs.getName() );

  }

  @Test
  public void testSetName_Happy() {
    McCoxs.setName("McMahons");
    assertEquals("testSetName_Happy should be equal", "McMahons", McCoxs.getName() );

  }

  @Test
  public void testGetStars_Happy() {
    assertEquals("testGetStars_Happy should be equal", 3, McCoxs.getStars() );
  }

  @Test
  public void testSetStars_Happy() {
    McCoxs.setStars(5);
    assertEquals("testSetStars_Happy should be equal", 5, McCoxs.getStars() );
  }

  @Test
  public void testGetReviews_Happy() {
    McCoxs.addReview("never liked him anyway", "Travis", 3, McCoxs);
    assertEquals("testGetReviews_Happy should be equal", "[Travis writes never liked him anyway giving them 3 stars]", McCoxs.getReviews().toString() );
  }

  @Test
  public void removeMovie() {
    McCoxs.addMovie("Wilbur");
    McCoxs.addMovie("Jameson");
    McCoxs.removeMovie("Wilbur");
    assertEquals("testaddMovie_Happy should be equal", "[Jameson]", McCoxs.getMovies().toString() );

  }
}
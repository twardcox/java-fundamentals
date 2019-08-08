package basiclibrary;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HashSetTest {
  @Test
  public void testWeatherNotice() {

    int[][] weeklyMonthTemperatures = {
        {66, 64, 58, 65, 71, 57, 60},
        {57, 65, 65, 70, 72, 65, 51},
        {55, 54, 60, 53, 59, 57, 61},
        {65, 56, 55, 52, 55, 62, 57}
    };

    String check = "High: 72\n" +
        "Low: 51\n" +
        "Never saw temperature: 63\n" +
        "Never saw temperature: 67\n" +
        "Never saw temperature: 68\n" +
        "Never saw temperature: 69\n";

    assertEquals(HashSetExample.weatherNotice(weeklyMonthTemperatures), check);
  }

  @Test
  public void testTally() {
    List<String> votes = new ArrayList<String>();
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Shrub");
    votes.add("Hedge");
    votes.add("Shrub");
    votes.add("Bush");
    votes.add("Hedge");
    votes.add("Bush");

    assertEquals(HashSetExample.tally(votes), "Bush received the most votes!");
  }

}

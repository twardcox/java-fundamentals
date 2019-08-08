package basiclibrary;
// Researched @ https://java-w3schools.blogspot.com/2017/10/java-hashset.html

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;


public class HashSetExample {

  public static String weatherNotice(int[][] arrs) {
    // Hashset Declaration and creating object.

    HashSet<Integer> uniqueTemps = new HashSet<Integer>();
    for (int[] arr : arrs) {
      for (int value : arr) {
        uniqueTemps.add(value);
      }
    }
    int lowestTemp = Collections.min(uniqueTemps);
    int highestTemp = Collections.max(uniqueTemps);

    //https://stackoverflow.com/questions/7775394/java-concatenate-to-build-string-or-format
    StringBuilder result = new StringBuilder();
    result.append("High: ").append(highestTemp).append("\n");
    result.append("Low: ").append(lowestTemp).append("\n");

    for (int i = lowestTemp; i < highestTemp; i++) {
      if (!uniqueTemps.contains(i)) result.append("Never saw temperature: ").append(i).append("\n");
    }
    return result.toString();
  }

  //  Tallying Election
////  Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.
  public static String tally(List<String> votes) {
//    https://stackoverflow.com/questions/505928/how-to-count-the-number-of-occurrences-of-an-element-in-a-list

    Map<String, Long> counts =
        votes.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

    String key = Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();

    return key + " received the most votes!";

  }


}




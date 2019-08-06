import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(2);

    clock();

  }

  public static String pluralize(String word, int num) {

    return num != 1 ? word + "s" : word;
  }

  public static void flipNHeads(int n) {
    Random rand = new Random();
    int count = 0;
    int headCount = 0;

    while (headCount < n) {

      count++;

      if (rand.nextFloat() < 0.6) {
        headCount = 0;
        System.out.println("tails");
      } else {
        headCount++;
        System.out.println("heads");
      }

    }
    System.out.println("It took " + count + " flips to flip " + n + " head in a row.");

  }

  public static void clock() {
    // researched @
    // https://www.codota.com/code/query/java.util+java.util@Timer
    int delay = 0;
    int interval = 1000;
    Timer timer = new Timer();

    String pattern = "HH:mm:ss";
    TimerTask task = new TimerTask() {
      public void run() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern)));
      }
    };
    timer.scheduleAtFixedRate(task, delay, interval);

  }

}

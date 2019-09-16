package code401challenges.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

  @Test
  public void testRepeatedWord_Happy() {
    String text = "Nice solution, unfortunately, StringTokenizer should not be used anymore. From the Docs: " +
                  "StringTokenizer is a legacy class that is retained for compatibility reasons although its use is discouraged in new code. It is recommended that anyone seeking this functionality use the split method of String or the java.util.regex package instead. ";

    assertEquals("testRepeatedWord_Happy should be equal","stringtokenizer",RepeatedWord.repeatedWord(text));

  }

  @Test
  public void testRepeatedWord_NoDuplicates() {
    String text = "Nice solution, unfortunately, should not be used anymore. From the Docs: ";
    assertEquals("testRepeatedWord_NoDuplicates should be equal",null,RepeatedWord.repeatedWord(text));
  }

  @Test
  public void testRepeatedWord_EmptyString() {
    String text = "";
    assertEquals("testRepeatedWord_EmptyString should be equal",null,RepeatedWord.repeatedWord(text));
  }

}
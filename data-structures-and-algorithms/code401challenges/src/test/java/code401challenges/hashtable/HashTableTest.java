package code401challenges.hashtable;

import org.junit.Test;

public class HashTableTest {

  @Test
  public void add() throws CloneNotSupportedException {
    HashTable HTable = new HashTable(1);
    HTable.add("mike", "mike");
    HTable.add("michael", "michael");
    System.out.println(HTable.contains("mike"));
  }

  @Test
  public void get() {
  }

  @Test
  public void contains() {
  }

  @Test
  public void expand() {
  }


}
package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

  @Test
  public void testAdd_CollisionMakesLinkedlist() {
    HashTable HTable = new HashTable(1);
    HTable.add("mike", "mike");
    HTable.add("michael", "michael");

    assertEquals("testAdd_CollisionMakesLinkedlist equals true", true, HTable.contains("michael"));
  }

  @Test
  public void testAdd_Happy() {
      HashTable HTable = new HashTable(4);
      HTable.add("mike", "mike");
      assertEquals("testAdd_Happy equals true", true, HTable.contains("mike"));
    }


  @Test
  public void get() {
    HashTable HTable = new HashTable(4);
    HTable.add("mike", "mike");
    assertEquals("testAdd_Happy equals true", "mike", HTable.get("mike"));
  }

 }
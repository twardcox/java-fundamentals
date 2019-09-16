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
  public void testAdd_RetrieveLinkedListItem() {
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
  public void testGet_Happy() {
    HashTable HTable = new HashTable(4);
    HTable.add("mike", "mike");
    assertEquals("testGet_Happy equals true", "mike", HTable.get("mike"));
  }

  @Test
  public void testGet_NotPresent() {
    HashTable HTable = new HashTable(4);
    HTable.add("mike", "mike");
    assertEquals("testGet_NotPresent equals true", null, HTable.get("bill"));
  }

  @Test
  public void testHash_Happy() {
    HashTable HTable = new HashTable(10);
    assertEquals("testHash_Happy equals true", 8, HTable.hash("mike"));
  }

 }
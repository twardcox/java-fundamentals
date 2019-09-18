package code401challenges.LeftJoin;

import code401challenges.hashtable.HashTable;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftJoinTest {

  @Test
  public void testLeftJoin_Happy() {
    HashTable leftTable = new HashTable(10);
    leftTable.add("fond", "enamored");
    leftTable.add("wrath", "anger");
    leftTable.add("diligent", "employed");
    leftTable.add("outfit", "garb");
    leftTable.add("guide", "usher");

    HashTable rightTable = new HashTable(10);
    rightTable.add("fond", "averse");
    rightTable.add("wrath", "delight");
    rightTable.add("diligent", "idle");
    rightTable.add("guide", "follow");
    rightTable.add("flow", "jam");

    assertEquals("testLeftJoin_Happy is equal","[[wrath, anger, delight], [diligent, employed, idle], [outfit, garb, NULL], [guide, usher, follow], [fond, enamored, averse]]", LeftJoin.leftJoin(leftTable, rightTable).toString());

  }

  @Test
  public void testLeftJoin_UnevenSides() {
    HashTable leftTable = new HashTable(10);
    leftTable.add("fond", "enamored");
    leftTable.add("wrath", "anger");
    leftTable.add("diligent", "employed");
    leftTable.add("outfit", "garb");
    leftTable.add("guide", "usher");

    HashTable rightTable = new HashTable(10);
    rightTable.add("fond", "averse");
    rightTable.add("guide", "follow");
    rightTable.add("flow", "jam");

    assertEquals("testLeftJoin_UnevenSides is equal","[[wrath, anger, NULL], [diligent, employed, NULL], [outfit, garb, NULL], [guide, usher, follow], [fond, enamored, averse]]", LeftJoin.leftJoin(leftTable, rightTable).toString());

  }

  @Test
  public void testLeftJoin_NullLeft() {
    HashTable leftTable = new HashTable(10);

    HashTable rightTable = new HashTable(10);
    rightTable.add("fond", "averse");
    rightTable.add("guide", "follow");
    rightTable.add("flow", "jam");

    assertEquals("testLeftJoin_UnevenSides is equal","[]", LeftJoin.leftJoin(leftTable, rightTable).toString());

  }
}
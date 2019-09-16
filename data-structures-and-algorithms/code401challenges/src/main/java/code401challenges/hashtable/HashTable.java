package code401challenges.hashtable;

import java.util.Arrays;

public class HashTable {

  private Node[] map;

  public HashTable(int size) {
    map = new Node[size];
  }

  // hash()
  public int hash(String key) {
    int hashValue = 0;
    char[] letters = key.toCharArray();
    for( int i = 0; i<letters.length; i++) {
      hashValue += letters[i];
    }

    hashValue = (hashValue * 599) % map.length;
    return hashValue;
  }

  // add()
  public void add(String key, String value) {

    // set a var (int) of the hash(key)
    int hashKey = hash(key);


//    if map has duplicate keys double map size
    if (this.map[hashKey] != null){
      expand();
    }

    // If map[hashvalue] is a thing ... do the linked list thing
    // Otherwise, just add the node.
    if( this.map[hashKey] == null ) {
      map[hashKey] = new Node(key, value);
    }
    else {
      Node temp = map[hashKey];
      map[hashKey] = new Node(key, value);
      map[hashKey].setNext(temp);
    }
    System.out.println(Arrays.toString(this.map));

  }

  // get()
  public String get(String key) {
    // hash the key (should give me the same thing)
    // if the hash table has that key, send back the value from the node.
    int  hashKey = hash(key);
    if(this.map[hashKey] != null ) {
      // Actually go through the list and check the actual value

      return (String) map[hashKey].value;
    }

    return null;
  }

  // contains()
  public boolean contains(String key) {
    int hashKey = hash(key);
    // Actually go through the list and check the actual value

    return map[hashKey] != null;
  }

  // double map size
  private void expand(){

    Node[] temp = this.map.clone();


    new HashTable(this.map.length * 2);

    for (Node item : this.map){
      add(item.key, item.value);
    }


    System.out.println("********************map 2" + Arrays.toString(map));


  }

}

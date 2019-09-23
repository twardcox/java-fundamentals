package code401challenges.hashtable;

public class HashTable {

  public Node[] map;

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

  }

  // get()
  public String get(String key) {
    // hash the key (should give me the same thing)
    // if the hash table has that key, send back the value from the node.
    int hashKey = hash(key);

    if (this.map[hashKey] != null) {
      Node currentNode = this.map[hashKey];

      while (currentNode != null) {
        if (currentNode.key.equals(key)) {
          return currentNode.value;
        }
        currentNode = currentNode.next;
      }
    }
    return null;
  }

  // get()
  public Node getNode(String key) {
    // hash the key (should give me the same thing)
    // if the hash table has that key, send back the value from the node.
    int hashKey = hash(key);

    if (this.map[hashKey] != null) {
      Node currentNode = this.map[hashKey];

      while (currentNode != null) {
        if (currentNode.key.equals(key)) {
          return currentNode;
        }
        currentNode = currentNode.next;
      }
    }
    return null;
  }

  // get linked list
  public String getAdjVertices(String key) {
    // hash the key (should give me the same thing)
    // if the hash table has that key, send back the value from the node.
    int hashKey = hash(key);

    if (this.map[hashKey] != null) {
      Node currentNode = this.map[hashKey];

      while (currentNode != null) {
        if (currentNode.key.equals(key)) {
          return currentNode.value;
        }
        currentNode = currentNode.next;
      }
    }
    return null;
  }

  public String remove(String key){
    int hashKey = hash(key);
    if (this.map[hashKey] == null){
      return "Node does not exist";
    }
//    if the key exists and does not have an attached linked list remove it
    if (this.map[hashKey] != null && this.map[hashKey].next == null && this.map[hashKey].value.equals(key)){
      this.map[hashKey] = null;
    }

//    if the key's value does not match key search linked list for value and remove it.
    if (this.map[hashKey] != null && this.map[hashKey].next != null && !this.map[hashKey].value.equals(key)){
      Node currentNode = this.map[hashKey];
      while (currentNode != null) {
        if (currentNode.next.key.equals(key)) {
//          remove that node
          Node temp = currentNode.next.next;
          currentNode.next.next = null;
          currentNode.next = temp;
          return currentNode.value;
        }
        currentNode = currentNode.next;
      }


    }

    return "This node does not exist";

  }

  // contains()
  public boolean contains(String key) {

    int hashKey = hash(key);

    if (this.map[hashKey] != null) {
      Node currentNode = this.map[hashKey];

      while (currentNode != null) {
        if (currentNode.key.equals(key)) {
          return true;
        }
        currentNode = currentNode.next;
      }

    }
    return false;
  }

// Oh shit.

  // double map size
  private void expand(){

//    make a copy of map
//    init new temp w/size = this.map
    Node[] temp = new Node[this.map.length];

//    iterate over map setting temp Node values
    for (int i = 0; i<temp.length; i++){
      temp[i] = new Node(this.map[i].key, this.map[i].value);
    }

//    delete old map by resetting Hash Table map
    new HashTable(temp.length * 2 );

//    iterate over map re-adding temp values
    for (Node item : temp){
      add(item.key, item.value);
    }




  }

}

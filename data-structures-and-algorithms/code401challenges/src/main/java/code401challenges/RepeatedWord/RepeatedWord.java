package code401challenges.RepeatedWord;

import code401challenges.hashtable.HashTable;

public class RepeatedWord {
//  Take in a string
//  split string into array
//  add to hashtable check for collision
//  check if colliding node values ==

  public static String repeatedWord(String words){
//    https://stackoverflow.com/questions/11726023/split-string-into-individual-words-java
    // https://stackoverflow.com/questions/18830813/how-can-i-remove-punctuation-from-input-text-in-java
    String[] arr = words.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

    HashTable newTable = new HashTable(arr.length * 2){};

    for (String word : arr){

      if (newTable.contains(word) && newTable.get(word).equals(word)){

        return word;
      }
      newTable.add(word, word);

    }

    return null;
  }
}

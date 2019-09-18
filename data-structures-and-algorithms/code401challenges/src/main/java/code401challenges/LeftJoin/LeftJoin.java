package code401challenges.LeftJoin;

import code401challenges.hashtable.HashTable;

import java.util.ArrayList;

public class LeftJoin {

  public static ArrayList leftJoin(HashTable left, HashTable right){

    ArrayList<ArrayList<String>> masterList = new ArrayList<>();

    for (int i =0 ; i<left.map.length; i++){

      if(left.map[i] != null){

        if (right.contains(left.map[i].key)){
          ArrayList<String> newWord = new ArrayList<>();
          newWord.add(left.map[i].key);
          newWord.add(left.map[i].value);
          newWord.add(right.get(left.map[i].key));
          masterList.add(newWord);
        } else {
          ArrayList<String> newWord = new ArrayList<>();
          newWord.add(left.map[i].key);
          newWord.add(left.map[i].value);
          newWord.add("NULL");
          masterList.add(newWord);
        }
      }
    }
    return masterList;
  }

}

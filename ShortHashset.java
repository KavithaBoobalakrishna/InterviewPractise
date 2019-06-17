package com.tricky.javaoutputs;

import java.util.HashSet;

/**
 * @author kaboobal
 *
 */
public class ShortHashset {
  public static void main(String[] args) {

    HashSet shortSet = new HashSet();
    for (short i = 0; i < 100; i++) {
      shortSet.add(i);
      shortSet.remove(i - 1);
    }
    System.out.println(shortSet.size());
  }

}

// OUTPUT: The Hashset is storing short types here hence on autoboxing it gets converted into short objects while
// storing in hashset
// the expression i-1 is converted into int while evaluating that is autoboxed to return Integer object
// But No Integer objects in this hashset, so it will not remove anything and size remains same 100
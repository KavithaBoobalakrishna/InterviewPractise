package com.demoexcercises;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author kaboobal
 *
 */
public class FirstOccuranceString {

  public static void main(String[] args) {

    String str = "JAVAJAVA";
    firstOccuranceString(str);
  }

  /**
   * @param str
   */
  private static void firstOccuranceString(String str) {

    char[] ch = str.toCharArray();
    Map<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

    // iterate over the character array and add the key and integer value into map likewise

    for (char c : ch) {
      // if (lhm.containsKey(c)) {
      // int count = (int) lhm.get(c);
      // lhm.put(c, count + 1);
      // }
      //
      // else {
      // lhm.put(c, 1);
      // }
      // Replacing above entire code with a single line

      lhm.merge(c, 1, Integer::sum);

    }
    System.out.println(lhm);

    // iterate over the map

    for (Iterator iterator = lhm.keySet().iterator(); iterator.hasNext();) {
      char c = (char) iterator.next();
      if (lhm.get(c) > 1) {
        System.out.println("The character " + c + " appears " + lhm.get(c) + " times");
      }

    }

  }

}

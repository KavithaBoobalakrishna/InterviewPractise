package com.demoexcercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author kaboobal
 *
 */
public class ConvertArraylistToStringArray {

  public static void main(String[] args) {

    ArrayList<String> al = new ArrayList<String>();
    al.add("JAVA");
    al.add("is");
    al.add("My");
    al.add("Love");

    System.out.println("Arraylist of string is " + al);

    String[] str = arrayToString(al);

    System.out.println("String[] is " + Arrays.toString(str));

  }

  /**
   * @param al
   * @return
   */
  public static String[] arrayToString(ArrayList<String> al) {

    // created the string array size equal to size of array
    String[] str = new String[al.size()];
    for (int i = 0; i < al.size(); i++) {

      str[i] = al.get(i);

    }

    return str;
  }

}

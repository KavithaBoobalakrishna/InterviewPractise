package com.demoexcercises;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author kaboobal
 *
 */
public class OccuranceOfStringUsingLambda {
  public static void main(String[] args) {

    Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();

    String str =
        "I work on java and would love to learn any new stuffs if given to work and java is like a love to most of programmers";

    String[] strArray = str.split(" ");

    for (String st : strArray) {
      lhm.merge(st, 1, Integer::sum);
    }

    System.out.println(lhm);
  }

}

package com.stream.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kaboobal
 *
 */
public class ConvertSteamToArray {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();

    for (int i = 1; i < 10; i++)
      list.add(i);

    // List<Integer> evenlist = list.stream().filter(i -> (i%2 == 0 )).collect(Collectors.toList()) ;
    // converting the stream to list

    Integer[] evenarray = list.stream().filter(i -> (i % 2 == 0)).toArray(Integer[]::new);

    for (Integer i : evenarray)
      System.out.println(i);

  }

}

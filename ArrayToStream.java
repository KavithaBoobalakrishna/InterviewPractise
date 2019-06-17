package com.demoexcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kaboobal
 *
 */
public class ArrayToStream {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 2, 3, 2, 4, 7, 5, 6, 9, 8, 6, 5));

    System.out.println("The arrays with duplicate elements are" + list);

    List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());

    System.out.println("The arrays without duplicate elemets are" + newlist);

  }

}

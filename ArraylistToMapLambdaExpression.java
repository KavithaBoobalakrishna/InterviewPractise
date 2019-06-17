package com.demoexcercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author kaboobal
 *
 */
public class ArraylistToMapLambdaExpression {
  public static void main(String[] args) {

    List<String> alist = new ArrayList<String>();
    alist.add("Kavitha");
    alist.add("Loves");
    alist.add("Loves");
    alist.add("Java");
    alist.add("Coding");

    System.out.println("Arraylist " + alist);

    Map<String, Integer> map = alist.stream()
        .collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e2, LinkedHashMap::new));

    System.out.println("The Hashmap is " + map);
  }

}

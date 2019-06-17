package com.stream.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kaboobal
 *
 */

// returns the stream itself so we can chain multiple method calls in a row

public class StreamIntermediatefunctions {
  public static void main(String[] args) {

    List<String> name = new ArrayList<String>();
    name.add("Amit");
    name.add("Apple");
    name.add("Chikku");
    name.add("Banana");
    name.add("Guava");
    name.add("Ghana");

    // 1.filter()
    name.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

    // 2.map()
    name.stream().map(String::toUpperCase).forEach(System.out::println);

    // 3.sorted()
    name.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

  }

}

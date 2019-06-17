package com.stream.methods;

import java.util.stream.Stream;

/**
 * @author kaboobal
 *
 */
public class MapExample {
  public static void main(String[] args) {

    // Stream<Date> stream = Stream.generate(() -> { return new Date();})
    // 1.returns present date stream

    // Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5 });
    // 2.creating Stream of integer array

    // IntStream stream = "abcde_12345".chars();
    // 3. returns the ascii values of the character

    // Stream<String> stream = Stream.of("A$B$C".split("\\$"));
    // 4. returns the each character of string

    // stream.forEach(ch -> System.out.println(ch));
    // 5. printing each element in stream

    // Stream<Character>.map(String::valueOf)
    // Stream<String>.map(Integer::parseInt)
    // Stream<Integer>

    Stream<Character> stream = Stream.of('1', '2', '3');

    Stream<Integer> str = stream.map(ch -> Integer.parseInt(ch.toString()));

    str.forEach(st -> System.out.println(st));

  }

}

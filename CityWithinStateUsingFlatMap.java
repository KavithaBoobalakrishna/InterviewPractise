package com.demoexcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kaboobal
 *
 */
public class CityWithinStateUsingFlatMap {
  public static void main(String[] args) {

    Allstate karnataka = new Allstate();
    karnataka.addCity("Bangalore");
    karnataka.addCity("Mangalore");

    Allstate tamilNadu = new Allstate();
    tamilNadu.addCity("Chennai");
    tamilNadu.addCity("Kovai");

    List<Allstate> allstates = Arrays.asList(karnataka, tamilNadu);

    List<String> allcities = allstates.stream().flatMap(e -> e.getCities().stream()).collect(Collectors.toList());

    System.out.println("The Cities are " + allcities);
  }

}

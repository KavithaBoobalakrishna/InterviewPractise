package com.demoexcercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kaboobal
 *
 */
public class Allstate {

  List<String> allcities = new ArrayList<String>();

  public void addCity(String city) {

    this.allcities.add(city);
  }

  public List<String> getCities() {

    return this.allcities;
  }

}

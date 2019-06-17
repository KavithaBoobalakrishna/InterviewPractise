package com.internationalisation;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author kaboobal
 *
 */
public class LocaleDemo {

  public static void main(String[] args) {

    String lang = "hi";
    String country = "IN";
    // Just change the lang and country to render different language

    Locale l = new Locale(lang, country);
    ResourceBundle r = ResourceBundle.getBundle("/Demo/src/com/internationalisation/Bundle.properties", l);
    // No need to change the path here again and again for different languages the locale object takes care of it.
    String str = r.getString("wish");
    System.out.println(str);
  }
}

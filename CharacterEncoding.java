package com.tricky.javaoutputs;

import java.util.Arrays;

/**
 * @author kaboobal
 *
 */
public class CharacterEncoding {
  public static void main(String[] args) {

    char[] chars = new char[] { '\u0097' };
    String str = new String(chars);
    System.out.println(str);
    byte[] bytes = str.getBytes();
    System.out.println(Arrays.toString(bytes));

  }

}

// OUTPUT: [-62, -105]
// Character Encoding :The rule that maps each Unicode character into a byte array is called a character encoding
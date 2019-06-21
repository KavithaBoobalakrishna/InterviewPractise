package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class SmallestSubstring {

  final static int no_of_chars = 256;

  public static void main(String[] args) {

    String str = "AAABCCDDD";
    int length = smallestSubstr_maxDistChar(str);
    System.out.println("The length of the smallest substring with distinct character is " + length);
  }

  /**
   * @param str
   * @return
   */
  private static int smallestSubstr_maxDistChar(String str) {

    int n = str.length();
    String subs = "";
    int max_distinct = max_distinct_char(str, n);
    int min_length = n;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        if (i < j)
          subs = str.substring(i, j);
        else
          subs = str.substring(j, i);

        int subs_length = subs.length();
        int sub_max_distinct = max_distinct_char(subs, subs_length);

        if (subs_length < min_length && sub_max_distinct == max_distinct)
          min_length = subs_length;
      }
    }

    return min_length;
  }

  /**
   * @param str
   * @param n
   * @return
   */
  private static int max_distinct_char(String str, int n) {

    int[] count = new int[no_of_chars];

    for (int i = 0; i < n; i++) {
      count[str.charAt(i)]++;
    }
    int max_distant = 0;

    for (int i = 0; i < no_of_chars; i++) {
      if (count[i] != 0)
        max_distant++;
    }
    return max_distant;
  }

}

// You pass the entire String to get the maximum distinct characters
// You use two pointers to point and get the substring
// Again you pass this substring to check for maximum distince characters
// Then apply a single if condition(substring length < string length and string and substring maximum distinct character
// are equal)
// That does the actual magic and return the minimum length

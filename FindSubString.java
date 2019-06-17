package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class FindSubString {
  public static void main(String[] args) {

    String str1 = "JAVALOVE";
    String str2 = "JAVA";
    if (findSubstring(str1, str2))
      System.out.println("YES");
    else
      System.out.println("NO");
  }

  /**
   * @param str1
   * @param str2
   */
  private static boolean findSubstring(String str1, String str2) {

    int j = 0;
    String str3 = "";

    for (int i = 0; i < str1.length() && j < str2.length(); i++) {

      if (str2.charAt(j) == str1.charAt(i)) {
        str3 += str2.charAt(j);
        j++;
        if (j > str2.length() - 1)
          break;

      } else {
        j = 0;
      }
    }

    if (str3.length() == str2.length()) {

      return true;
    } else {

      return false;
    }

  }

}

package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class WideningProcess {
  public static void main(String[] args) {

    String s3 = "JournalDev";
    int start = 1;
    char end = 5;
    System.out.println(start + end);
    System.out.println(s3.substring(start, end));
  }

}

// OUTPUT: 6
// ourn (excludes the end position)

// Due to the process of widening the end of char type is widend int int type and hence the first
// sysout gives 6 (if it was string instead of char then it would have been widedned to string)
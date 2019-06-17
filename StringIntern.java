package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class StringIntern {
  public static void main(String[] args) {

    String s1 = new String("JAVA");
    String s2 = s1.intern();
    String s3 = "JAVA";
    System.out.println(s1 == s2);
    System.out.println(s3 == s2);
  }

}
// OUTPUT: The 1.sysout gives false and 2. sysout gives true
// s1 will be created in the heap memory and string constant pool(SCP) as well
// so when s1.intern() is used the scp string JAVA is returned to s2 and str3 is also created in scp hence returns true

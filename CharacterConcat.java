package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class CharacterConcat {

  public static void main(String[] args) {

    System.out.println('j' + 'a' + 'v' + 'a');
  }

}

// OUTPUT: 418
// java <- would have been printed if the string literals were used("")
// Since the character literals have been used the ascii value of the characters 106+97+118+97 = 418
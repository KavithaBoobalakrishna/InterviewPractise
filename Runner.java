package com.stack;

/**
 * @author kaboobal
 *
 */
public class Runner {
  public static void main(String[] args) {

    DStack nums = new DStack();
    nums.push(15);
    nums.push(8);
    nums.push(19);
    nums.push(18);
    nums.push(22);

    nums.show();

    nums.pop();
    nums.pop();
    nums.pop();

    nums.show();
  }

}

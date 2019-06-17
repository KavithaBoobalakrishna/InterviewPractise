package com.stack;

/**
 * @author kaboobal
 *
 */
public class Stack {

  int[] stack = new int[5];

  int top = 0;

  public void push(int data) {

    if (this.top == 5) {
      System.out.println("The stack is full");
    } else {
      this.stack[this.top] = data;
      this.top++;
    }
  }

  public void show() {

    for (int st : this.stack)
      System.out.println(st);

  }

  /**
   *
   */
  public int pop() {

    int data = 0;
    if (this.top <= 0) {
      System.out.println("The stack is empty");
    } else {
      this.top--;
      data = this.stack[this.top];
      this.stack[this.top] = 0;

    }
    return data;
  }

  /**
   *
   */
  public int peek() {

    int data = this.stack[this.top - 1];

    return data;
  }

  /**
   *
   */
  public int size() {

    return this.top;

  }

  /**
   *
   */
  public boolean isEmpty() {

    return this.top <= 0;

  }

}

package com.stack;

/**
 * @author kaboobal Creating dynamic Array
 */
public class DStack {

  int capacity = 2;

  int[] stack = new int[this.capacity];

  int top = 0;

  public void push(int data) {

    if (size() == this.capacity)
      expand();
    this.stack[this.top] = data;
    this.top++;

  }

  /**
   *
   */
  private void expand() {

    int length = size();
    this.capacity *= 2;
    int[] newstack = new int[this.capacity];
    System.arraycopy(this.stack, 0, newstack, 0, length);
    this.stack = newstack;

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
      shrink();
    }
    return data;
  }

  /**
   *
   */
  private void shrink() {

    int length = size();
    if (length <= ((this.capacity / 2) / 2)) {
      this.capacity = this.capacity / 2;
      int[] newstack = new int[this.capacity];
      System.arraycopy(this.stack, 0, newstack, 0, length);
      this.stack = newstack;
    }
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

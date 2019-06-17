package com.QueueDemo;

/**
 * @author kaboobal
 *
 */
public class Queue {

  int[] queue = new int[5];

  int front = 0;

  int rear = 0;

  int size = 0;

  public void enQueue(int data) {

    if (!IsFull()) {
      this.queue[this.rear % 5] = data;
      this.rear = this.rear + 1;
      this.size = this.size + 1;
    } else
      System.out.println("The queue is full");

  }

  public int deQueue() {

    int data = 0;
    if (!IsEmpty()) {
      data = this.queue[this.front % 5];
      this.front = this.front + 1;
      this.size = this.size - 1;
    } else
      System.out.println("The queue is empty");
    return data;
  }

  public int getSize() {

    return this.size;
  }

  public boolean IsEmpty() {

    return getSize() == 0;
  }

  public boolean IsFull() {

    return getSize() == 5;
  }

  void show() {

    System.out.print("Elements are" + " ");
    for (int i = 0; i < this.size; i++)
      System.out.print(this.queue[(this.front + i) % 5] + " ");
  }

}

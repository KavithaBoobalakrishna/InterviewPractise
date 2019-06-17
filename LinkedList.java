package com.LinkedListCreationAndTraversalPrint;

/**
 * @author kaboobal
 *
 */
public class LinkedList {

  Node head; // first node of linkedlist

  void insert(int data) {

    Node node = new Node(data);

    if (this.head == null) {
      this.head = node;
    } else {

      Node n = this.head;
      while (n.next != null) {
        n = n.next;
      }
      n.next = node;
    }
  }

  void insertStart(int data) {

    Node node = new Node(data);
    node.next = this.head;
    this.head = node;
  }

  void show() {

    Node n = this.head;
    while (n != null) {
      System.out.println(n.data + " ");
      n = n.next;
    }

  }

  void insertAt(int index, int data) {

    if (index == 0)
      insertStart(data);

    else {
      Node node = new Node(data);
      Node n = this.head;
      for (int i = 0; i < index - 1; i++) {
        n = n.next;
      }
      node.next = n.next;
      n.next = node;
    }

  }

  void deleteAt(int index) {

    if (index == 0) {
      this.head = this.head.next;
    } else {
      Node n = this.head;

      for (int i = 0; i < index - 1; i++) {

        n = n.next;
      }

      Node n1 = n.next;
      n.next = n1.next;
    }

  }

  public void deleteLast() {

    Node last = this.head;
    Node previousLast = null;

    while (last.next != null) {
      previousLast = last;
      last = last.next;
    }

    previousLast.next = null;

  }

}

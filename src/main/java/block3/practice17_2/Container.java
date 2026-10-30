package block3.practice17_2;

import java.util.NoSuchElementException;

public class Container {

  private Node head = null;
  private Node tail = null;
  private int size = 0;

  public void addFirst() {
    Node newNode = new Node();
    newNode.readAttributes();

    if (isEmpty()) {
      head = tail = newNode;
      tail.next = head;
    } else {
      newNode.next = head;
      head = newNode;
      tail.next = head;
    }

    size += 1;
  }

  public void addLast() {
    Node newNode = new Node();
    newNode.readAttributes();

    if (isEmpty()) {
      head = tail = newNode;
      tail.next = head;
    } else {
      tail.next = newNode;
      tail = newNode;
      tail.next = head;
    }

    size += 1;
  }

  public Node removeFirst() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }

    Node removedNode = head;

    if (hasOneNode()) {
      head = tail = null;
    } else {
      Node next = head.next;
      head.next = null;
      head = next;
      tail.next = head;
    }

    size -= 1;
    return removedNode;
  }

  public Node removeLast() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }

    Node removedNode = tail;

    if (hasOneNode()) {
      head = tail = null;
    } else {
      Node prev = head;
      while (prev.next != tail) {
        prev = prev.next;
      }
      tail = prev;
      tail.next = head;
    }

    size -= 1;
    return removedNode;
  }

  public void printNode(int index) {
    if (index >= size() || index < 0) {
      throw new NoSuchElementException();
    }

    Node nodeToPrint = head;
    for (int i = 0; i < index; i++) {
      nodeToPrint = nodeToPrint.next;
    }
    nodeToPrint.printAttributes();
  }

  public void clear() {
    head = tail = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  private boolean hasOneNode() {
    return head == tail;
  }

}

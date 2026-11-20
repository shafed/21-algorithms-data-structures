package block5.practice23;

public class LinkedQueue extends AbstractQueue {
  private Node head;
  private Node tail;

  private static class Node {
    private final Object value;
    private Node next;

    private Node(Object value) {
      this.value = value;
    }
  }

  @Override
  protected void enqueueImpl(Object value) {
    Node node = new Node(value);
    if (isEmpty()) {
      head = node;
    } else {
      tail.next = node;
    }
    tail = node;
  }

  @Override
  protected Object elementImpl() {
    return head.value;
  }

  @Override
  protected void dequeueImpl() {
    head = head.next;
    if (head == null) {
      tail = null;
    }
  }

  @Override
  protected void clearImpl() {
    head = null;
    tail = null;
  }
}

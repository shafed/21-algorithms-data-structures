package block5.practice23;

import java.util.NoSuchElementException;

public class ArrayQueue extends AbstractQueue {
  private final Object[] elements;
  private int head;

  // Инвариант: 0 <= size() <= elements.length и 0 <= head < elements.length.
  // Начиная с head, в массиве лежат size() элементов в порядке поступления.
  // При переходе за конец массива отсчёт продолжается с индекса 0.

  // Предусловие: capacity больше нуля.
  // Постусловие: создана пустая очередь вместимостью capacity элементов.
  public ArrayQueue(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("Capacity must be positive");
    }
    elements = new Object[capacity];
  }

  @Override
  protected void enqueueImpl(Object value) {
    int size = size();
    if (size == elements.length) {
      throw new IllegalStateException("Queue is full");
    }

    int slotsBeforeWrap = elements.length - head;
    int index;
    if (size < slotsBeforeWrap) {
      index = head + size;
    } else {
      index = size - slotsBeforeWrap;
    }
    elements[index] = value;
  }

  @Override
  protected Object elementImpl() {
    return elements[head];
  }

  @Override
  protected void dequeueImpl() {
    elements[head] = null;
    head++;
    if (head == elements.length) {
      head = 0;
    }
  }

  @Override
  protected void clearImpl() {
    for (int remaining = size(); remaining > 0; remaining--) {
      dequeueImpl();
    }
    head = 0;
  }

  public static void main(String[] args) {
    int capacity = 5;
    ArrayQueue queue = new ArrayQueue(capacity);
    System.out.println("Очередь пуста: " + queue.isEmpty());

    for (int i = 1; i <= capacity; i++) {
      queue.enqueue(i);
    }
    System.out.println("Первый элемент: " + queue.element());
    System.out.println("Размер после element(): " + queue.size());

    try {
      queue.enqueue(capacity + 1);
    } catch (IllegalStateException e) {
      System.err.println("Добавление в полную очередь: " + e.getMessage());
    }

    System.out.println("Удалён первый элемент: " + queue.dequeue());
    queue.enqueue(capacity + 1);
    System.out.print("Порядок после добавления в освободившуюся ячейку:");
    for (int i = 0; i < capacity; i++) {
      System.out.print(" " + queue.dequeue());
    }
    System.out.println();

    queue.enqueue(capacity + 2);
    queue.clear();
    System.out.println("Размер после clear(): " + queue.size());
    System.out.println("Очередь пуста: " + queue.isEmpty());

    try {
      queue.element();
    } catch (NoSuchElementException e) {
      System.err.println("element(): " + e.getMessage());
    }

    try {
      queue.dequeue();
    } catch (NoSuchElementException e) {
      System.err.println("dequeue(): " + e.getMessage());
    }

    ArrayQueue other = new ArrayQueue(capacity);
    queue.enqueue(1);
    System.out.println("Другая очередь пуста: " + other.isEmpty());
    queue.clear();

    try {
      new ArrayQueue(0);
    } catch (IllegalArgumentException e) {
      System.err.println("Вместимость 0: " + e.getMessage());
    }
  }
}

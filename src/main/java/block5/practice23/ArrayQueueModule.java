package block5.practice23;

import java.util.NoSuchElementException;

public class ArrayQueueModule {
  private static final int CAPACITY = 5;
  private static final Object[] elements = new Object[CAPACITY];
  private static int head;
  private static int size;

  // Инвариант: 0 <= size <= CAPACITY и 0 <= head < CAPACITY.
  // Начиная с head, в массиве лежат size элементов в порядке поступления.
  // При переходе за конец массива отсчёт продолжается с индекса 0.

  private ArrayQueueModule() {}

  // Предусловие: в очереди есть свободное место.
  // Постусловие: value добавлен в конец очереди, размер увеличился на один.
  public static void enqueue(Object value) {
    if (size == CAPACITY) {
      throw new IllegalStateException("Queue is full");
    }

    int slotsBeforeWrap = CAPACITY - head;
    int index;
    if (size < slotsBeforeWrap) {
      index = head + size;
    } else {
      index = size - slotsBeforeWrap;
    }
    elements[index] = value;
    size++;
  }

  // Предусловие: очередь непуста.
  // Постусловие: возвращён первый элемент, состояние очереди сохранено.
  public static Object element() {
    if (isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    return elements[head];
  }

  // Предусловие: очередь непуста.
  // Постусловие: первый элемент удалён и возвращён, размер уменьшился на один.
  public static Object dequeue() {
    Object first = element();
    elements[head] = null;
    head++;
    if (head == CAPACITY) {
      head = 0;
    }
    size--;
    return first;
  }

  // Предусловие: любое корректное состояние очереди.
  // Постусловие: возвращено число элементов, состояние очереди сохранено.
  public static int size() {
    return size;
  }

  // Предусловие: любое корректное состояние очереди.
  // Постусловие: возвращено true, если очередь пуста, иначе false.
  // Состояние очереди сохранено.
  public static boolean isEmpty() {
    return size == 0;
  }

  // Предусловие: любое корректное состояние очереди.
  // Постусловие: очередь пуста, размер равен нулю.
  public static void clear() {
    while (!isEmpty()) {
      dequeue();
    }
    head = 0;
  }

  public static void main(String[] args) {
    int capacity = CAPACITY;
    clear();
    System.out.println("Очередь пуста: " + isEmpty());

    for (int i = 1; i <= capacity; i++) {
      enqueue(i);
    }
    System.out.println("Первый элемент: " + element());
    System.out.println("Размер после element(): " + size());

    try {
      enqueue(capacity + 1);
    } catch (IllegalStateException e) {
      System.err.println("Добавление в полную очередь: " + e.getMessage());
    }

    System.out.println("Удалён первый элемент: " + dequeue());
    enqueue(capacity + 1);
    System.out.print("Порядок после добавления в освободившуюся ячейку:");
    for (int i = 0; i < capacity; i++) {
      System.out.print(" " + dequeue());
    }
    System.out.println();

    enqueue(capacity + 2);
    clear();
    System.out.println("Размер после clear(): " + size());
    System.out.println("Очередь пуста: " + isEmpty());

    try {
      element();
    } catch (NoSuchElementException e) {
      System.err.println("element(): " + e.getMessage());
    }

    try {
      dequeue();
    } catch (NoSuchElementException e) {
      System.err.println("dequeue(): " + e.getMessage());
    }
  }
}

package block5.practice23;

import java.util.NoSuchElementException;

public class ArrayQueueADT {
  private final Object[] elements;
  private int head;
  private int size;

  // Инвариант: 0 <= size <= elements.length и 0 <= head < elements.length.
  // Начиная с head, в массиве лежат size элементов в порядке поступления.
  // При переходе за конец массива отсчёт продолжается с индекса 0.
  // Общее предусловие для статических методов: queue ссылается на созданную очередь.

  // Предусловие: capacity больше нуля.
  // Постусловие: создана пустая очередь вместимостью capacity элементов.
  public ArrayQueueADT(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("Capacity must be positive");
    }
    elements = new Object[capacity];
  }

  // Предусловие: в очереди есть свободное место.
  // Постусловие: value добавлен в конец очереди, размер увеличился на один.
  public static void enqueue(ArrayQueueADT queue, Object value) {
    if (queue.size == queue.elements.length) {
      throw new IllegalStateException("Queue is full");
    }

    int slotsBeforeWrap = queue.elements.length - queue.head;
    int index;
    if (queue.size < slotsBeforeWrap) {
      index = queue.head + queue.size;
    } else {
      index = queue.size - slotsBeforeWrap;
    }
    queue.elements[index] = value;
    queue.size++;
  }

  // Предусловие: очередь непуста.
  // Постусловие: возвращён первый элемент, состояние очереди сохранено.
  public static Object element(ArrayQueueADT queue) {
    if (isEmpty(queue)) {
      throw new NoSuchElementException("Queue is empty");
    }
    return queue.elements[queue.head];
  }

  // Предусловие: очередь непуста.
  // Постусловие: первый элемент удалён и возвращён, размер уменьшился на один.
  public static Object dequeue(ArrayQueueADT queue) {
    Object first = element(queue);
    queue.elements[queue.head] = null;
    queue.head++;
    if (queue.head == queue.elements.length) {
      queue.head = 0;
    }
    queue.size--;
    return first;
  }

  // Постусловие: возвращено число элементов, состояние очереди сохранено.
  public static int size(ArrayQueueADT queue) {
    return queue.size;
  }

  // Постусловие: возвращено true, если очередь пуста, иначе false.
  // Состояние очереди сохранено.
  public static boolean isEmpty(ArrayQueueADT queue) {
    return queue.size == 0;
  }

  // Постусловие: очередь пуста, размер равен нулю.
  public static void clear(ArrayQueueADT queue) {
    while (!isEmpty(queue)) {
      dequeue(queue);
    }
    queue.head = 0;
  }

  public static void main(String[] args) {
    int capacity = 5;
    ArrayQueueADT queue = new ArrayQueueADT(capacity);
    System.out.println("Очередь пуста: " + isEmpty(queue));

    for (int i = 1; i <= capacity; i++) {
      enqueue(queue, i);
    }
    System.out.println("Первый элемент: " + element(queue));
    System.out.println("Размер после element(): " + size(queue));

    try {
      enqueue(queue, capacity + 1);
    } catch (IllegalStateException e) {
      System.err.println("Добавление в полную очередь: " + e.getMessage());
    }

    System.out.println("Удалён первый элемент: " + dequeue(queue));
    enqueue(queue, capacity + 1);
    System.out.print("Порядок после добавления в освободившуюся ячейку:");
    for (int i = 0; i < capacity; i++) {
      System.out.print(" " + dequeue(queue));
    }
    System.out.println();

    enqueue(queue, capacity + 2);
    clear(queue);
    System.out.println("Размер после clear(): " + size(queue));
    System.out.println("Очередь пуста: " + isEmpty(queue));

    try {
      element(queue);
    } catch (NoSuchElementException e) {
      System.err.println("element(): " + e.getMessage());
    }

    try {
      dequeue(queue);
    } catch (NoSuchElementException e) {
      System.err.println("dequeue(): " + e.getMessage());
    }

    ArrayQueueADT other = new ArrayQueueADT(capacity);
    enqueue(queue, 1);
    System.out.println("Другая очередь пуста: " + isEmpty(other));
    clear(queue);

    try {
      new ArrayQueueADT(0);
    } catch (IllegalArgumentException e) {
      System.err.println("Вместимость 0: " + e.getMessage());
    }
  }
}

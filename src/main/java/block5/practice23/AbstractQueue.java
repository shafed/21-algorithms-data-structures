package block5.practice23;

import java.util.NoSuchElementException;

public abstract class AbstractQueue implements Queue {
  private int size;

  @Override
  public void enqueue(Object value) {
    enqueueImpl(value);
    size++;
  }

  @Override
  public Object element() {
    if (isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    return elementImpl();
  }

  @Override
  public Object dequeue() {
    Object first = element();
    dequeueImpl();
    size--;
    return first;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public void clear() {
    clearImpl();
    size = 0;
  }

  // Методы-реализации, счётчик обновляет AbstractQueue.
  protected abstract void enqueueImpl(Object value);

  protected abstract Object elementImpl();

  protected abstract void dequeueImpl();

  protected abstract void clearImpl();
}

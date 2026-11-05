package block4.practice20;

import block1.practice6.Animal;
import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
  private T t;
  private V v;
  private K k;

  public GenericClass(T t, V v, K k) {
    this.t = t;
    this.v = v;
    this.k = k;
  }

  public T getT() {
    return t;
  }

  public V getV() {
    return v;
  }

  public K getK() {
    return k;
  }

  public void printClasses() {
    System.out.println("Class of t: " + t.getClass());
    System.out.println("Class of v: " + v.getClass());
    System.out.println("Class of k: " + k.getClass());
  }

}

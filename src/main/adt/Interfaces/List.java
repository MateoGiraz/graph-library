package adt.Interfaces;

public interface List<T> {
  public int totalElements();

  public void addElement(T data);

  public void removeElement(T data);

  public Iterable<T> data();
}
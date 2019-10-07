package deque;

public interface Deque {

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    public void insertLeft(int i);

    public void insertRight(int i);

    public int removeLeft();

    public int removeRight();

    public int peekLeft();

    public int peekRight();

}

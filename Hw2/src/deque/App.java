package deque;

public class App {
    public static void main(String[] args) {
        DequeImpl q = new DequeImpl(5);
        q.insertLeft(11);
        q.insertLeft(22);
        q.displayDeque();
        System.out.println(q.peekLeft());
        System.out.println(q.peekRight());
        q.insertRight(33);
        q.displayDeque();
        System.out.println(q.peekLeft());
        System.out.println(q.peekRight());
        q.insertRight(44);
        q.insertRight(55);
        q.displayDeque();
        System.out.println(q.peekLeft());
        System.out.println(q.peekRight());

        q.removeLeft();
        q.displayDeque();
        System.out.println(q.peekLeft());
        System.out.println(q.peekRight());
        q.removeRight();
        q.displayDeque();
        System.out.println(q.peekLeft());
        System.out.println(q.peekRight());

        q.insertLeft(66);
        q.displayDeque();
        System.out.println(q.peekLeft());
        System.out.println(q.peekRight());
        q.insertRight(77);
        q.displayDeque();
        System.out.println(q.peekLeft());
        System.out.println(q.peekRight());
    }
}

package list;

public interface LinkedList {

    void insertFirst(String name, int age);

    Link delete();

    Link delete(String name);

    Link find(String name);

    boolean isEmpty();

    void display();

}

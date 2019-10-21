package double_link_list;

import list.LinkedList;

public interface DoubleLinkedList extends LinkedList {

    void insertLast(String name, int age);

    boolean isFind(String name);

}

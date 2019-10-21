package iterator;

import list.Link;
import list.LinkedListImpl;

public class ListIterator {

    private Link current;

    private Link prev;
    private LinkedListImpl list;

    public ListIterator(LinkedListImpl list) {
        this.list = list;
        reset();
    }

    private void reset() {
        current = list.getFirst();
        prev = null;
    }

    public void nextLink() {
        prev = current;
        current = current.next;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Link link = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(link);
            current = link;
        } else {
            link.next = current.next;
            current.next = link;
            nextLink();
        }
    }

    public void insertBefore(String name, int age) {
        Link link = new Link(name, age);
        if (prev == null) {
            link.next = list.getFirst();
            list.setFirst(link);
            reset();
        } else {
            link.next = prev.next;
            prev.next = current = link;
        }
    }

    public Link deleteCurrent() {
        Link temp = current;
        if (current.next != null && prev != null) {
            current = current.next;
            prev.next = current;
        } else if (prev == null && current.next != null) {
            current = current.next;
        } else if (current.next == null && prev != null) {
            prev.next = null;
            reset();
            prev = null;
        } else {
            list.delete();
            current = null;
        }
        return temp;
    }
}

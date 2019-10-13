package double_link_list;

import list.Link;

public class DoubleLinkedListImpl implements DoubleLinkedList {

    public Link first;
    public Link last;

    public DoubleLinkedListImpl() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    @Override
    public void insertLast(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    @Override
    public Link delete() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    @Override
    public void display() {
        Link current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }

    @Override
    public Link delete(String name) {
        Link current = first;
        Link prev = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                prev = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            prev.next = current.next;
        }
        return current;
    }

    @Override
    public Link find(String name) {
        Link current = first;
        while (!current.name.equals(name)) {
            if (current.name == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    @Override
    public boolean isFind(String name) {
        boolean result = false;
        Link current = first;
        while (current.name != null) {
            if (current.name.equals(name)) {
                result = true;
                break;
            } else if (current.next != null) {
                current = current.next;
            } else {
                break;
            }
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }
}

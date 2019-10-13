package list;

public class LinkedListImpl implements LinkedList {

    private Link first;

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkedListImpl() {
        this.first = null;
    }

    @Override
    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        newLink.next = first;
        first = newLink;
    }

    @Override
    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
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
        if (current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
    }

    @Override
    public Link find(String name) {
        Link current = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public void display() {
        Link current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }
}

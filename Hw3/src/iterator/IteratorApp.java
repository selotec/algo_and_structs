package iterator;


import list.LinkedListImpl;
import list.Link;

public class IteratorApp {

    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        ListIterator iterator = new ListIterator(list);

        iterator.insertAfter("Anton", 33);
        iterator.insertAfter("Garik", 21);
        iterator.insertBefore("Petr", 7);
        iterator.insertBefore("Anna", 12);
        list.display();
        System.out.println();

        System.out.println("Current: " + iterator.getCurrent().name);
        Link deletedCurrent = iterator.deleteCurrent();
        System.out.println("Deleted: " + deletedCurrent.name);
        list.display();
        System.out.println("Current: " + iterator.getCurrent().name);
        System.out.println();

        do {
            Link deleted = iterator.deleteCurrent();
            System.out.println("Deleted " + deleted.name);
            System.out.println("Current: " + iterator.getCurrent().name);
        } while (!iterator.atEnd());
        System.out.println("Reached the end of an iterator! Current = " + iterator.getCurrent().name);
        System.out.println("State of list:");
        list.display();
        System.out.println();

        System.out.println("Purging list");
        while (iterator.getCurrent() != null) {
            Link deleted = iterator.deleteCurrent();
            System.out.println("Deleted " + deleted.name);

            if (iterator.getCurrent() != null) {
                System.out.println("Current: " + iterator.getCurrent().name);
            } else {
                System.out.println("List purged!");
            }
        }
    }
}

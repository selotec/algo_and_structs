package double_link_list;

public class DoubleLinkedListApp {

    public static void main(String[] args) {
        DoubleLinkedListImpl list = new DoubleLinkedListImpl();
        list.insertFirst("Ivan", 23);
        list.insertFirst("Kate", 17);
        list.insertFirst("John", 33);
        list.insertLast("Stas", 22);
        list.display();
        System.out.println();
        list.delete("Ivan");
        System.out.println("search result: " + list.isFind("Stas"));
        list.delete();
        list.insertFirst("Dima", 40);
        list.display();
    }
}

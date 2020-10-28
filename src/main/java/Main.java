import linklist.LinkList;

public class Main {

    public static void main(String[] args) {
        LinkList linkList= new LinkList();
        linkList.createList(5);
        linkList.insertAtEnd(6);
        linkList.insertAtEnd(8);
        linkList.inserAtStart(10);
        linkList.inserAtStart(12);
        linkList.displayList();

        System.out.println("Size: "+linkList.listLength());
        System.out.println("First Element: "+linkList.getFirst());
    }
}

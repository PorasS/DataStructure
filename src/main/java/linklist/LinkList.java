package linklist;

public class LinkList {

    Node head = null;

    /**
     * @param num
     */
    public void createList(Integer num) {
        // if head is null, create a new node and point head to that node
        if (head == null) {
            Node node = new Node();
            node.setData(num);
            node.setLink(null);
//            head.setLink(node);
            head=node;
        }
    }

    /**
     *
     */
    public void displayList() {

        Node p = head;

        while(p.getLink()!=null){
            System.out.println(p.getData());
            p=p.getLink();
        }
        System.out.println(p.getData());
    }

    public void inserAtStart(Integer num){
        if(head==null){
            Node node= new Node();
            node.setData(num);
            node.setLink(null);
            head=node;
        }else{
         Node p = head;
         Node node= new Node();
         node.setData(num);
         node.setLink(p);
         head=node;
        }
    }

    public void insertAtEnd(Integer num){

        Node p = head;
        while(p.getLink()!=null){
            p=p.getLink();
        }

        // create a node and add at the end of the list
        Node node = new Node();
        node.setData(num);
        node.setLink(null);
        p.setLink(node);
    }

    public int listLength(){
        int counter=0;
        Node p = head;
        if(p!=null){
            while(p.getLink()!=null){
                counter++;
                p=p.getLink();
            }
            counter++;
        }
        return counter;
    }

    public int getFirst(){
        return head.getData();
    }

}

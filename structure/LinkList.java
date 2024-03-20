package structure;

public class LinkList {
    Node head;

    public LinkList(Node head) {
        this.head = head;
    }

    public void add(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void delted(){
        head=head.next;


   
}
}
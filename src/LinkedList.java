public class LinkedList {
    Node head;

    public void append(char type, int quantity){
        Node newNode = new Node(type,quantity);
        if (head == null) {
            head = new Node(type,quantity);
            return;
        }
        newNode.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void append(char type, int quantity, double price) {
        Node newNode = new Node(type,quantity,price);
        if (head == null) {
            head = new Node(type,quantity,price);
            return;
        }
        newNode.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
}

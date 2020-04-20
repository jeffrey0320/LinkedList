public class LinkedList {
    Node head;

    public void append(char type, int quantity){
        if (head == null) {
            head = new Node(type,quantity);
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(type,quantity);
    }

    public void append(char type, int quantity, double price){
        if (head == null) {
            head = new Node(type,quantity,price);
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(type,quantity,price);
    }
}

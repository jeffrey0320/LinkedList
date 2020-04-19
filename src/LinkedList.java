public class LinkedList {
    Node head;

    public void append(char type, int quantity){
        if (head == null) {
            head = new Node(type,quantity);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(type,quantity);
    }
}

public class Node {
    private char type;
    private int quantity;
    private double price;
    Node next;

    Node(char type, int quantity){
        this.type = type;
        this.quantity = quantity;
    }

    Node(char type, int quantity, double price){
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

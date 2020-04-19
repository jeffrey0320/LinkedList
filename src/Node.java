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

}

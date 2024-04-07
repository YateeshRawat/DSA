package Linklist;

public class LinklistUse {
    public static void main(String[] args) {
        Node b1 = new Node(10);
        Node b2 = new Node(20);
        Node b3 = new Node(30);
        Node b4 = new Node(40);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        System.out.print(b1.next.next.data);
    }
}

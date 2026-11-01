class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListNode {
    public static void main(String[] args) {
        // Create 4 nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Link them together
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        // Traverse forward and count
        Node current = first;
        int count = 0;

        System.out.println("Traversing the doubly linked list:");
        while (current != null) {
            System.out.println("Element: " + current.data);
            count++;
            current = current.next;
        }

        System.out.println("Total number of elements: " + count);
    }
}

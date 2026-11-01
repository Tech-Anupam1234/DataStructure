// Complete LinkedList implementation with removeDuplicate() method
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add node to the end
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove duplicates method (corrected)
    void removeDuplicate() {
        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    // Duplicate found, remove it
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // Print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create a linked list with duplicates
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(4);
        list.append(1);
        list.append(5);
        list.append(3);

        System.out.println("Original Linked List:");
        list.printList();

        // Remove duplicates
        list.removeDuplicate();

        System.out.println("\nLinked List after removing duplicates:");
        list.printList();

        // Test with empty list
        LinkedList emptyList = new LinkedList();
        System.out.println("\nEmpty list before:");
        emptyList.printList();
        emptyList.removeDuplicate();
        System.out.println("Empty list after removeDuplicate:");
        emptyList.printList();

        // Test with all duplicates
        LinkedList allDuplicates = new LinkedList();
        allDuplicates.append(5);
        allDuplicates.append(5);
        allDuplicates.append(5);
        allDuplicates.append(5);

        System.out.println("\nList with all duplicates before:");
        allDuplicates.printList();
        allDuplicates.removeDuplicate();
        System.out.println("List with all duplicates after:");
        allDuplicates.printList();

        // Test with no duplicates
        LinkedList noDuplicates = new LinkedList();
        noDuplicates.append(10);
        noDuplicates.append(20);
        noDuplicates.append(30);

        System.out.println("\nList with no duplicates before:");
        noDuplicates.printList();
        noDuplicates.removeDuplicate();
        System.out.println("List with no duplicates after:");
        noDuplicates.printList();
    }
}
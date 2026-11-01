class createList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void add(int data) {
        Node newNode = new Node(data);
        // check if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point the new node to itself to make it circular

        } else {
            tail.next = newNode; // Point the current tail to the new node
            tail = newNode; // Update the tail to the new node
            tail.next = head; // Point the new tail to head to maintain circular structure
        }
    }

    void disp() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();

    }

    // delete end node
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail.next = head;

            } else {
                head = null;
                tail = null;

            }

        }

    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        createList c1 = new createList();
        // add data to the list
        c1.add(100);
        c1.add(200);
        c1.add(300);
        c1.disp();

    }
}

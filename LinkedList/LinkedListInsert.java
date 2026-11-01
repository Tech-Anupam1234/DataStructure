class InsertMid {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null, tail = null;
    int size = 0;

    // Add node at end
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Add node in middle
    public void addMid(int data) {
        Node newNode = new Node(data);

        // If list empty
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        int mid = size / 2;

        Node curr = head;

        for (int i = 0; i < mid - 1; i++) {
            curr = curr.next;
        }

        Node temp = curr.next;

        // Insert between curr and temp
        curr.next = newNode;
        newNode.prev = curr;

        newNode.next = temp;
        if (temp != null) {
            temp.prev = newNode;
        } else {
            tail = newNode;
        }

        size++;
    }

    // Display list
    public void disp() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertMid dlist = new InsertMid();

        dlist.addNode(1);
        dlist.addNode(2);

        System.out.println("Original List:");
        dlist.disp();

        dlist.addMid(3);
        System.out.println("After inserting 3 in middle:");
        dlist.disp();

        dlist.addMid(4);
        System.out.println("After inserting 4 in middle:");
        dlist.disp();

        dlist.addMid(5);
        System.out.println("After inserting 5 in middle:");
        dlist.disp();
    }
}

//***************************************************** 
/* Main concept

curr.next = newNode
newNode.prev = curr
newNode.next = temp
temp.prev = newNode

 */
class DoublyLinkedList {
    class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {

            this.data = data;
        }

        Node head, tail = null;

        void addNode(int data) {
            // create new node
            Node newNode = new Node(data);
            // if list is empty
            if (head == null) {
                // both head and tail point to the newNode
                head = tail = newNode;
                // head previous point to null
                head.previous = null;
                // tails next will be point to null as it is the last node of the list
                tail.next = null;

            } else {
                // new node will be added after tail such that tails next will point to newNode
                tail.next = newNode;
                // new Node previous will be point to tail
                newNode.previous = tail;
                // new node becomes new Tail
                tail = newNode;
                // as is last node ,tails next node will be point to null
                tail.next = null;
            }
        }

        void disp() {
            //
            Node current = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }

        }

        public static void main(String args[]) {
            DoublyLinkedList dlist = new DoublyLinkedList();
            // add nodes tyo the list
            dlist.addNode(100);
            dlist.addNode(200);
            dlist.addNode(300);

            // disp
            dlist.disp();

        }

    }

    public void addNode(int i) {
        // TO DO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNode'");
    }

    public void disp() {
        // TO DO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disp'");
    }
}

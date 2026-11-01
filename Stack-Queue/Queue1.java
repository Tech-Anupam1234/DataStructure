class Queue {
    static int front, rear, maxsize;
    static int queue[];

    Queue(int size) {
        front = rear = 0;
        maxsize = size;
        queue = new int[maxsize];

    }

    // Enqueue an element
    void Enquee(int item) {
        // check if the queue is full
        if (maxsize == rear) {
            System.out.println("\n Queue is Full\n");
            return;

        }
        // enqueue element at rear
        else {
            queue[rear] = item;
            rear++;

        }
        return;

    }

    // Dequeue an element from queue
    void Dequeue() {
        // check if queue is empty
        if (front == rear) {
            System.out.println("\n Queue is Empty\n");
            return;
        }
        // shifting the element to the right by one place uptil rear

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < maxsize)
                queue[rear] = 0;
            // decrement rear
            rear--;
        }
    }

    // Print the Dequeue element
    void queueDisp() {
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty\n");
            return;
        }
        // traverse the front to rear and print element
        for (i = front; i < rear; i++) {
            System.out.println(queue[i]);
        }
        return;
    }

    // print front of the queue
    void queueFront() {
        if (front == rear) {
            System.out.println("Queue is Empty\n");
            return;
        }
        System.out.println("\nFront Element of the queue:" + queue[front]);
        return;
    }

}

class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println("Initial Queue:");
        // print queueu element
        q.queueDisp();

        // insert the element
        q.Enquee(10);
        q.Enquee(20);
        q.Enquee(30);
        q.Enquee(40);
        q.Enquee(50);

        // print queue element
        System.out.println("Queue after Enqueue:");
        q.queueDisp();
        // print front of the queue
        q.Enquee(90);
        // print
        q.queueDisp();

        // Dequeue
        q.Dequeue();
        q.Dequeue();
        System.out.println("\nQueue after dequeue");

        // print queue elements
        q.queueDisp();
        // print front of queue
        q.queueFront();

    }
}

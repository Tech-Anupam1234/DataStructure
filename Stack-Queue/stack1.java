import java.util.*;
//import java.lang.*;

class stack {
    int top;
    int maxsize = 10;
    int arr[] = new int[maxsize];

    boolean isEmpty() {
        return (top < 0);
    }

    stack() {
        top = -1;

    }

    boolean push(Scanner sc) {
        if (top == maxsize - 1) {
            System.out.println("Overflow!");
            return false;
        } else {
            System.out.println("Enter value");
            int val = sc.nextInt();
            // top++;
            top = top + 1;
            arr[top] = val;
            System.out.println("Item pushed");
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("UnderFlow!");
            return false;

        } else {
            top--;
            System.out.println("Item popped");
            return true;

        }
    }

    void disp() {
        System.out.println("Printing stack elements..");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        System.out.println("Stack operation using array");
        System.out.println("\n=========================");
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n choose one from the below  option..\n");
            System.out.println("\n1.push\n2.pop\n3.show\n4.Exit");
            System.out.println("\n Enter your choice \n");
            choice = sc.nextInt();
            switch ((choice)) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.disp();
                    break;
                }
                case 4: {
                    System.out.println("exiting..");
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("Please enter valid choice");

                }

            }

        }
    }
}
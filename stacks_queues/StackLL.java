/**
 * Stack implementation using Linked List.
 * LIFO (Last In First Out) principle.
 */
public class StackLL {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek() {
        return (top == null) ? -1 : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top now: " + stack.peek());
    }
}

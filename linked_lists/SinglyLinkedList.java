/**
 * Singly Linked List Implementation.
 * Covers: Insertion (Start, End), Deletion, Search, and Display.
 */
public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;

    // Insert at the end
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(data);
    }

    // Insert at the beginning
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete first occurrence of key
    public void delete(int key) {
        if (head == null) return;
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(10);
        list.append(20);
        list.prepend(5);
        list.display(); // 5 -> 10 -> 20 -> null
        list.delete(10);
        list.display(); // 5 -> 20 -> null
    }
}

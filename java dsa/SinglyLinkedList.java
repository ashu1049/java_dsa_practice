

public class SinglyLinkedList {

    // Step 1: Node class
    static class Node {
        int data;      // data part
        Node next;     // reference to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head;

    // Step 2: Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Step 3: Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Step 4: Delete by value
    public void delete(int key) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If head needs to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Step 5: Display list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Step 6: Main method
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("After inserting at end:");
        list.display();

        list.insertAtBeginning(5);
        System.out.println("After inserting at beginning:");
        list.display();

        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();
    }
}
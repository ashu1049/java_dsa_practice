
public class DoublyLinkedList {

    // Node class
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        // If list is not empty
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a node by value
    public void delete(int key) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;

        // If head node is to be deleted
        if (temp.data == key) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Search the node to delete
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // If value not found
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        // If node is not last
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        // Link previous node to next node
        temp.prev.next = temp.next;
    }

    // Display forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display backward
    public void displayBackward() {
        if (head == null) return;
        Node temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.print("Forward: ");
        list.displayForward();
        System.out.print("Backward: ");
        list.displayBackward();
        list.delete(30);
        System.out.print("After deleting 30 (Forward): ");
        list.displayForward();
    }
}
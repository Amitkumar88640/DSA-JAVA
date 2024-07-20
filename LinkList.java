import java.util.LinkedList;
import java.util.Scanner;
public class LinkList {
    static Node head;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void insertAtBeg(int data) {
        Node newNode = new Node(data);
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

    static void displayList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkList list = new LinkList();
        list.insertAtBeg(5);
        list.insertAtBeg(10);
        list.displayList(head);

        
    }
}
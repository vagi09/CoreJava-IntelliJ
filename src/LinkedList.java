import org.w3c.dom.Node;

public class LinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;

            next = null;
        }

    }

    public void printMyLinkList() {

        Node n = head;
        while (n != null) {

            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        Node first = ll.new Node(10);
        ll.head = first;

        Node sec = ll.new Node(20);
        first.next = sec;

        Node third = ll.new Node(30);
        sec.next = third;

        ll.printMyLinkList();


    }
}

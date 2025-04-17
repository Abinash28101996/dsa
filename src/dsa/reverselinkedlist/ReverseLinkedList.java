package dsa.reverselinkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

    public Node reverseLinkedList(Node head) {
        Node temp = head;
        Node reverseHead = null;
        while (temp != null) {
            temp = temp.next;
            head.next = reverseHead;
            reverseHead = head;
            head = temp;
        }
        return reverseHead;
    }
}

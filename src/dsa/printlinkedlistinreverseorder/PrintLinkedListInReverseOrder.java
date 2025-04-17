package dsa.printlinkedlistinreverseorder;

import java.util.LinkedList;

public class PrintLinkedListInReverseOrder {
//    private LinkedList<Integer> linkedList;
//    public PrintLinkedListInReverseOrder(LinkedList<Integer> linkedList) {
//        this.linkedList = linkedList;
//    }

    public void printLinkedListInReverseOrder(Node head) {
        if (head == null) {
            return;
        }
        printLinkedListInReverseOrder(head.next);
        System.out.print(head.value + " --> ");
    }
}

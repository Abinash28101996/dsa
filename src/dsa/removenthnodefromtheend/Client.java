package dsa.removenthnodefromtheend;

public class Client {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        RemoveNthNodeFromTheEnd removeNthNodeFromTheEnd = new RemoveNthNodeFromTheEnd();
        Node node = removeNthNodeFromTheEnd.removeNthNodeFromEnd(n1, 2);
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
